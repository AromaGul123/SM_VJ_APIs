package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.RegisterUser_VJ;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterUser_VJAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void registerUser() {

        RegisterUser_VJ api = new RegisterUser_VJ();
        ActualResponse = api.RegisterUser();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}