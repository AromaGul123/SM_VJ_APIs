package Requests;

import Payload.AddBookingPayload;
import Payload.CustomerRegistrationPayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class CustomerRegistration {

//    String res1;
//    Response response;
//    Header header;

    public Response register() {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, CustomerRegistrationPayload.registerPayload);
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/customer/register")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("grant_type", "password")
                .addHeader("iscustomerloggedin", "false")
                .addHeader("signedinuserid", "8")
                .addHeader("accesstoken", "bff8cb2b-9cf7-4257-9c14-51ac3984c3ae")
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