package Requests;

import Payload.AddBookingPayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class ServiceLocations {

//    String res1;
//    Response response;
//    Header header;

    public Response ServiceLocations() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1/constants/service-locations")
                .get()
                .addHeader("accessToken", "bff8cb2b-9cf7-4257-9c14-51ac3984c3ae")
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