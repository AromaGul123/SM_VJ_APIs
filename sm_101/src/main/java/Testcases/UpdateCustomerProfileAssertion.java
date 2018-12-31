package Testcases;

import General.Main;
import Requests.UpdateCustomerProfile;
import Requests.UserProfile;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UpdateCustomerProfileAssertion  extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void addBooking() {

        UpdateCustomerProfile api = new UpdateCustomerProfile();
        ActualResponse = api.CustomerProfileUpdate();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}