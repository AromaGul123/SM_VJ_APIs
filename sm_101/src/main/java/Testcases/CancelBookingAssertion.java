package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.CancelBooking;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CancelBookingAssertion  extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void cancelBooking() {

        CancelBooking api = new CancelBooking();
        ActualResponse = api.CancelBooking();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Cancel Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}