package Requests;

import Payload.UpdateCustomerProfilePayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class UpdateCustomerProfile {

//    String res1;
//    Response response;
//    Header header;

    public Response CustomerProfileUpdate() {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, UpdateCustomerProfilePayload.UpdateCustomerProfilePayload);
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/customer/update-customer-profile")
                .put(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("accessToken", "bff8cb2b-9cf7-4257-9c14-51ac3984c3ae")
                .addHeader("isCustomerLoggedIn", "true")
                .addHeader("signedInUserId", "50878")
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