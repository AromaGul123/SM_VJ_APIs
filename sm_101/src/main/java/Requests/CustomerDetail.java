package Requests;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CustomerDetail {

//    String res1;
//    Response response;
//    Header header;

    public Response GetCustomerDetail() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/customer/27")
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