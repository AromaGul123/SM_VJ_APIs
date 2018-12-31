package Requests;

import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class GetTokenForWebUser {

//    String res1;
//    Response response;
//    Header header;

    public Response GetTokenWeb() {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=password&username=aroma.gul%40venturedive.com%20&password=q7doet3f&client_id=SM-WEB-CLIENT&undefined=");
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/oauth/token")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }
}