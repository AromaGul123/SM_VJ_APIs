package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.GetCustomerToken_VJ;
import com.squareup.okhttp.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Converter;
import org.testng.TestNGException;
import org.testng.annotations.Test;


import org.testng.xml.XMLParser;

import java.io.InputStream;

import static io.restassured.http.ContentType.XML;
import static org.jsoup.nodes.Document.OutputSettings.Syntax.xml;


public class GetCustomerToken_VJAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;




    @Test
    public void getCustomertoken() {

        GetCustomerToken_VJ api = new GetCustomerToken_VJ();
        ActualResponse = api.GetCustomerToken_VJ();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Add Booking of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}