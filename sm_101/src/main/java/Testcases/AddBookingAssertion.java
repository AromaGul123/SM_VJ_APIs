package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.UserProfile;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddBookingAssertion extends Main {
    Response ActualResponse;
    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void addBooking() {

        AddBooking api = new AddBooking();
        ActualResponse = api.PostBooking();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}