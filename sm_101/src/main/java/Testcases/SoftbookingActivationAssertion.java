package Testcases;

import General.Main;
import Requests.SoftbookingActivation;
import Requests.UserProfile;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SoftbookingActivationAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void Softbooking() {

        SoftbookingActivation api = new SoftbookingActivation();
        ActualResponse = api.ActivationSoftbooking();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Soft booking Activation Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}