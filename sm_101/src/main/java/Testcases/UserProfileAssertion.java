package Testcases;

import General.Main;
import Requests.CustomerDetail;
import Requests.UserProfile;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserProfileAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void getUserProfile() {

        UserProfile api = new UserProfile();
        ActualResponse = api.GetUserProfile();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Get User Profile Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}