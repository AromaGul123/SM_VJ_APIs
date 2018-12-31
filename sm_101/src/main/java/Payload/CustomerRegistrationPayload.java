package Payload;


import java.util.Random;

public class CustomerRegistrationPayload {

    public static double rand= (Math.random() * 50000);


    public static String registerPayload = "{\n" +
            "\"addressModel\": {\n" +
            "\"addressLine1\": null,\n" +
            "\"city\": \"1\",\n" +
            "\"addressLine2\": \"\",\n" +
            "\"area\": \"2\",\n" +
            "\"building\": \"Testing1\",\n" +
            "\"apartment\": \"Testing1\"\n" +
            "},\n" +
            "\"contactInformationModel\": {\n" +
            "\"personName\": \"Aroma\",\n" +
            "\"personLastName\": \"Gul\",\n" +
            "\"personEmail\": \"aroma.gul+"+rand+"@venturedive.com\",\n" +
            "\"personPhone\": \"+971234234234542\",\n" +
            "\"customerContactNumbers\": [\n" +
            "{\n" +
            "\"contactType\": \"Mobile\",\n" +
            "\"contactNumber\": \"+971234234234542\",\n" +
            "\"isPreferred\": \"true\"\n" +
            "}\n" +
            "]\n" +
            "}\n" +
            "}";





}
