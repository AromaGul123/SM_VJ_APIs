package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.ServiceLocations;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ServiceLocationsAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void serviceLocations() {

        ServiceLocations api = new ServiceLocations();
        ActualResponse = api.ServiceLocations();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Service Locations of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}