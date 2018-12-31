package Payload;
import Requests.AddBooking;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;


public class AddBookingPayload {


    public static String addBookingPayload = "{\"householdRequestModel\":{\"contactInformationModel\":{\"personName\":\"Test\",\"personLastName\":\"Test\",\"personEmail\":\"aroma.gul@venturedive.com\",\"personPhone\":\"+9290078601\"},\"serviceIds\":[41],\"serviceRequestTime\":\"December 08, 2018 04:00\",\"serviceProviderIds\":[],\"promoCode\":null,\"description\":null,\"address\":{\"addressLine1\":null,\"city\":\"1\",\"addressLine2\":\"\",\"area\":\"60\",\"building\":\"Build One\",\"apartment\":\"22\"},\"hoursRequired\":\"4\",\"equipmentNeeded\":\"No\",\"requestFrequency\":\"65\",\"numberOfWorkers\":\"1\",\"movingSizeId\":null,\"serviceLocationIdsToAdd\":[1],\"isBooking\":1,\"customerId\":26777,\"bookingDetails\":{\"createCustomerProfile\":false,\"bookingPaymentDetail\":{\"paymentMethod\":\"BOOKING_PAYMENT_METHOD_EMPTY\",\"isPaymentMethodVerified\":false,\"creditCardId\":null},\"partTimeCleaningBookingModel\":{\"bookingStartDate\":\"2018-12-08\",\"bookingTime\":\"12:00\",\"numberOfWorkers\":\"1\",\"equipmentNeeded\":\"No\",\"requestFrequency\":\"65\",\"hoursRequired\":\"4\",\"numberOfWeekDays\":[3]}},\"planId\":\"5\"}}";





}
