package Payload;


public class AddSubscriptionBookingPayload {


    public static String addSubscriptionBookingPayload = "{\n" +
            "\t\"householdRequestModel\": {\n" +
            "\t\t\"contactInformationModel\": {\n" +
            "\t\t\t\"personName\": \"Test\",\n" +
            "\t\t\t\"personLastName\": \"Test\",\n" +
            "\t\t\t\"personEmail\": \"aroma.gul{{$randomInt}}@venturedive.com\",\n" +
            "\t\t\t\"personPhone\": \"+971 5456456\"\n" +
            "\t\t},\n" +
            "\t\t\"serviceIds\":[  \n" +
            "        41\n" +
            "      ],\n" +
            "      \"serviceRequestTime\":\"January 29, 2019 04:00\",\n" +
            "      \"serviceProviderIds\":[\n" +
            "      ],\n" +
            "      \"promoCode\":\"ABCD\",\n" +
            "      \"description\":null,\n" +
            "\t\t\"address\": {\n" +
            "\t\t\t\"addressLine1\": null,\n" +
            "\t\t\t\"city\": \"1\",\n" +
            "\t\t\t\"addressLine2\": \"\",\n" +
            "\t\t\t\"area\": \"1\",\n" +
            "\t\t\t\"building\": \"test\",\n" +
            "\t\t\t\"apartment\": \"test\"\n" +
            "\t\t},\n" +
            "\t \"requestFrequency\":\"66\",\n" +
            "      \"serviceLocationIdsToAdd\":[  \n" +
            "         1\n" +
            "      ],\n" +
            "      \"isBooking\":1,\n" +
            "\t\t\"customerId\": 12384,\n" +
            "\t \"bookingDetails\":{  \n" +
            "         \"createCustomerProfile\":false,\n" +
            "         \"bookingPaymentDetail\":{  \n" +
            "         \t\n" +
            "            \"creditCardId\":503,\n" +
            "            \"paymentMethod\":\"CREDIT_CARD\",\n" +
            "            \"isPaymentMethodVerified\":true\n" +
            "         }, \n" +
            "         \"partTimeCleaningBookingModel\": {\n" +
            "        \"bookingStartDate\": \"2019-03-29\",\n" +
            "        \"equipmentNeeded\":\"No\",\n" +
            "        \"bookingTime\": \"15:00\",\n" +
            "        \n" +
            "        \"hoursRequired\": 4,\n" +
            "        \"numberOfWeekDays\": [\n" +
            "          1\n" +
            "        ],\n" +
            "        \"numberOfWorkers\": 1,\n" +
            "        \"requestFrequency\": 66\n" +
            "      }\n" +
            "      },\n" +
            "          \"isCouponAttached\": true,\n" +
            "      \"couponValidationModel\":{\n" +
            "      \t\"validDate\":\"2019-12-07\",\n" +
            "      \"couponCode\":\"CREDITCARD\",\n" +
            "      \"serviceId\":\"41\",\n" +
            "      \"isRecurring\":1,\n" +
            "      \"serviceLocationId\":[1],\n" +
            "      \"price\":100,\n" +
            "      \"couponRules\":\n" +
            "      {\"HOURS_OF_JOB\":\"4\",\n" +
            "      \"DAYS_OF_WEEK\":\"3\",\n" +
            "      \"PAYMENT_METHOD\":\"CREDIT_CARD\"}\n" +
            "      },\n" +
            "      \"planId\":\"5\"\n" +
            "   }\n" +
            "}";





}
