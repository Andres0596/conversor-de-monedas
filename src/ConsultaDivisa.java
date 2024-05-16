import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    public Divisa convertirDivisa(String base_code, String target_code, double cantidad) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/156dcb33df194d580167dc45/pair/"+ base_code + "/" + target_code + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Divisa.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public double verDivisa(String moneda1, String moneda2, double cantidad){
        return convertirDivisa(moneda1,moneda2,cantidad).conversion_result();
    }


}
