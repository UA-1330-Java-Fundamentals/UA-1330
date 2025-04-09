package homework17.ServerTasksList;
/*
Create a simple HTTP server in Java that allows clients to manage a basic to-do list by sending HTTP requests.
Requirements:
Start a local HTTP server on port 8080.
The server should expose an endpoint: http://localhost:8080/tasks
 */
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class TasksServer {
        public static void main(String[] args) throws IOException {
            List<String> tasks = new ArrayList<>();

            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            server.createContext("/tasks", exchange -> {
                System.out.println("Processing request from: " +
                        exchange.getRemoteAddress() + " : " +
                        exchange.getRequestMethod() + " : " +
                        exchange.getRequestURI());

                String method = exchange.getRequestMethod();

                if (method.equals("GET")) {
                    String message = String.join("\n", tasks);
                    byte[] responseBody = message.getBytes();

                    exchange.sendResponseHeaders(200, responseBody.length);
                    try (var response = exchange.getResponseBody()) {
                        response.write(responseBody);
                    }
                } else if (method.equals("POST")) {
                        InputStream input = exchange.getRequestBody();
                        String newTask = new String(input.readAllBytes());

                        tasks.add(newTask);

                        String messagePost = "Task added!";
                        byte[] messageText = messagePost.getBytes();

                        exchange.sendResponseHeaders(201, messageText.length);
                        try (var response = exchange.getResponseBody()) {
                            response.write(messageText);
                        }
                    } else {
                    String error = "Method not allowed";
                    exchange.sendResponseHeaders(405, error.length());
                    try (var response = exchange.getResponseBody()) {
                        response.write(error.getBytes());
                    }
                }
            });

            server.start();
            System.out.println("Server started on http://localhost:8080/tasks");

        }
}
