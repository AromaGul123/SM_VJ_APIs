package Requests;

import Payload.AddBookingPayload;
import Payload.RegisterUser_VJPayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class RegisterUser_VJ {

//    String res1;
//    Response response;
//    Header header;

    public Response RegisterUser() {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, RegisterUser_VJPayload.registerPayload);
        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.5/customerapp/customerappadmin/d0cc7db09d2846efa490cda6209e4656/user/register?mode=REGISTER")
                .post(body)
                .addHeader("Content-Type", "application/json")
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