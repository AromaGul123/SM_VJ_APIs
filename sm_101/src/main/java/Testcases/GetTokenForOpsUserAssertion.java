package Testcases;

import General.Main;
import Requests.GetTokenForOpsUser;
import Requests.GetTokenForWebUser;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetTokenForOpsUserAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void getToken() {

        GetTokenForOpsUser api = new GetTokenForOpsUser();
        ActualResponse = api.GetTokenOps();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Get Token for ops user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}