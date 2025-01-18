import com.google.code.gso;

import java.net.URI;
import  java.net.http.HttpClient;
import  java.net.http.HttpRequest;
import  java.net.http.HttpResponse;

public class consultarmonedas {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9d892ea3015c0fa5d1a8072d/latest/USD"+monedaBase+"/"+monedaTarget);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder();
        .uri(direccion)
                .build();




        try {
            HttpResponse<String>  response = client
                    .send(request, HttpResponse.BodyHandler.ofString());
            return new Gson().from Json(response.body(), Monedas.class);

        }
        catch (Exception e){
                throw new RuntimeException("No econtre la Moneda")
        }
    }
}

