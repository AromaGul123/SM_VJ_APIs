package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.FreezeBooking;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class FreezeBookingAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void freezeBooking() throws IOException {

        FreezeBooking api = new FreezeBooking();
        ActualResponse = api.FreezeBooking();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Freeze Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}