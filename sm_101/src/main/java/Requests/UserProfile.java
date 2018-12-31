package Requests;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class UserProfile {



    public Response GetUserProfile() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/user/profile")
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "bearer bff8cb2b-9cf7-4257-9c14-51ac3984c3ae")
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