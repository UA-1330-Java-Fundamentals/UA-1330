package homework17.LectureExample;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyClient {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI("http://localhost:8080/hello")) //"https://www.google.com"
                .build();
        try {
            for (int i = 0; i < 10; i++) {
                HttpResponse<String> response = client.send(request,
                        HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            System.out.println("Status: " + statusCode);
            if (statusCode == 200) {
                System.out.println(response.headers().map());
                String body = response.body();
                System.out.println(body);
            }
            Thread.sleep(1000);
        }
        } catch (Exception e) {
            System.out.println("Error during request execution: " + e);
        }
    }
}
