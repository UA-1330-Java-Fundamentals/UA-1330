package homework17.LectureExample;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;

public class MyServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080), 0);
        server.createContext("/hello", exchange -> {
            System.out.println("Processing request from: " +
                    exchange.getRemoteAddress() + " : " +
                    exchange.getRequestMethod() + " : " +
                    exchange.getRequestURI());
            String message = "Hello HTTP! " + LocalDateTime.now();
            byte[] responseBody = message.getBytes();
            exchange.sendResponseHeaders(200, responseBody.length);
            try ( var response = exchange.getResponseBody()) {
                response.write(responseBody);
            }
        });
        server.createContext("/stop", exchange -> {
            System.out.println("Bye! Stopping server...");
            var responseBody = "Bye from the server!".getBytes();
            exchange.sendResponseHeaders(200, responseBody.length);
            try ( var response = exchange.getResponseBody()) {
                response.write(responseBody);
            }
            server.stop(1);
        });
        server.start();

        //open http://localhost:8080/hello in browser
    }
}
