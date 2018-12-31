package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.NewTokenGeneration_VJ;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTokenGeneration_VJAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void newToken() {

        NewTokenGeneration_VJ api = new NewTokenGeneration_VJ();
        ActualResponse = api.NewTokenGeneration_VJ();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}