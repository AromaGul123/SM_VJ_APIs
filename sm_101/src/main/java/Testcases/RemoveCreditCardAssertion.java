package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.RemoveCreditCard;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveCreditCardAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void removeCredit() {

        RemoveCreditCard api = new RemoveCreditCard();
        ActualResponse = api.RemoveCredit();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Remove Credit Card of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}