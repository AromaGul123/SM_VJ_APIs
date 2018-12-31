package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.AddSubscriptonBooking;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddSubscriptionBookingAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void addSubsBooking() {

        AddSubscriptonBooking api = new AddSubscriptonBooking();
        ActualResponse = api.AddSubscriptionBooking();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Subscription Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}