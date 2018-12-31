package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.AuthenticateCustomer_VJ;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AuthenticationCustomer_VJAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void authCustomer() {

        AuthenticateCustomer_VJ api = new AuthenticateCustomer_VJ();
        ActualResponse = api.AuthenticateCustomer_VJ();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Authenticate user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}