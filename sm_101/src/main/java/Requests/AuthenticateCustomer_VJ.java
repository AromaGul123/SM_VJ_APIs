package Requests;

import Payload.AddBookingPayload;
import Payload.AuthenticateCustomer_VJPayload;
import com.squareup.okhttp.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class AuthenticateCustomer_VJ {

//    String res1;
//    Response response;
//    Header header;

    public Response AuthenticateCustomer_VJ() {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, AuthenticateCustomer_VJPayload.authenticatePayload);
        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.6/user/customerappadmin/customerappadmin/authenticate/")
                .put(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Postman-Token", "ceb65c8b-5908-4217-80ff-e5ffe3954b64")
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