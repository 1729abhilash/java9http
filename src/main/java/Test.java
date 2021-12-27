import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient=HttpClient.newHttpClient();
        HttpRequest httpRequest=HttpRequest.newBuilder(new URI("http://www.google.com")).GET().build();
   HttpResponse<String> response=    httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        HttpHeaders headers=response.headers();
        Map<String, List<String>>  map=headers.map();
        map.forEach((k,v)->System.out.println(k+" "+v));
    


    }
}
