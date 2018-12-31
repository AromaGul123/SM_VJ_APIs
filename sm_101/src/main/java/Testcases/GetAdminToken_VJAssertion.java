package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.GetAdminToken_VJ;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetAdminToken_VJAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void getToken() {

        GetAdminToken_VJ api = new GetAdminToken_VJ();
        ActualResponse = api.GetAdminToken_VJ();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Admin Token of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}