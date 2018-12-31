package Requests;

import Payload.AddBookingPayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class NewTokenGeneration_VJ {

//    String res1;
//    Response response;
//    Header header;

    public Response NewTokenGeneration_VJ() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.1/user/customerappadmin/lucy@vd.com/token")
                .get()
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