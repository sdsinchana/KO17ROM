package com.xworkz.makemytrip;

import com.xworkz.makemytrip.constants.PaymentMethod;
import com.xworkz.makemytrip.dto.MakeMyTripDto;
import com.xworkz.makemytrip.booking.MakeMyTripBooking;

public class MakeMyTripRunner {

    public static void main(String[] args) {

        MakeMyTripDto dto = new MakeMyTripDto();
        dto.setPassengerName("Rohit Sharma");
        dto.setEmail("rohit.sharma@gmail.com");
        dto.setContactNumber("9998887776");
        dto.setDepartureCity("Bangalore");
        dto.setArrivalCity("Delhi");
        dto.setTravelDate("2025-04-20");
        dto.setNumberOfPassengers(2);
        dto.setFare(7599.99);
        dto.setPaymentMethod(PaymentMethod.CREDIT_CARD);


        

        MakeMyTripBooking booking = new MakeMyTripBooking();
        booking.bookFlight(dto);
        booking.fetchDetails();
    }
}
