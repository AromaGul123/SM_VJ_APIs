package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.CancelBookingEvent;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CancelBookingEventAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void canceleventBooking() {

        CancelBookingEvent api = new CancelBookingEvent();
        ActualResponse = api.CancelBookingEvent();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Cancel Booking Event of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}