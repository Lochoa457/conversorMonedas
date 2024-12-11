import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private static final String API_KEY = "f2ac90735ee5e039ec1715c6";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public Moneda buscarMoneda(String base, String destino) {
        URI direccion = URI.create(BASE_URL + API_KEY + "/pair/" + base + "/" + destino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al consultar la API: " + e.getMessage());
            return null;
        }
    }
}
