package com.xworkz.makemytrip.booking;

import com.xworkz.makemytrip.dto.MakeMyTripDto;

public class MakeMyTripBooking {
MakeMyTripDto dto;
    public boolean bookFlight(MakeMyTripDto dto) {

        boolean bookingConfirmed = false;
        boolean validated = validateBooking(dto);
        if (validated) {
            bookingConfirmed = true;
            this.dto = dto;
            System.out.println("Flight booking successful!");
        } else {
            System.out.println("Flight booking failed due to invalid details.");
        }
        return bookingConfirmed;
    }

    public boolean validateBooking(MakeMyTripDto dto) {
        boolean isValid = true;

        if (dto.getPassengerName() == null || dto.getPassengerName().isEmpty()) {
            System.out.println("Invalid Passenger Name");
            isValid = false;
        }

        if (dto.getEmail() == null || dto.getEmail().isEmpty()) {
            System.out.println("Invalid Email");
            isValid = false;
        }

        if (dto.getContactNumber() == null || dto.getContactNumber().isEmpty()) {
            System.out.println("Invalid Contact Number");
            isValid = false;
        }

        if (dto.getDepartureCity() == null || dto.getDepartureCity().isEmpty()) {
            System.out.println("Invalid Departure City");
            isValid = false;
        }

        if (dto.getArrivalCity() == null || dto.getArrivalCity().isEmpty()) {
            System.out.println("Invalid Arrival City");
            isValid = false;
        }

        if (dto.getTravelDate() == null || dto.getTravelDate().isEmpty()) {
            System.out.println("Invalid Travel Date");
            isValid = false;
        }

        if (dto.getNumberOfPassengers() <= 0) {
            System.out.println("Invalid Number of Passengers");
            isValid = false;
        }

        if (dto.getFare() <= 0) {
            System.out.println("Invalid Fare");
            isValid = false;
        }

        if (dto.getPaymentMethod() == null) {
            System.out.println("Invalid Payment Method");
            isValid = false;
        }

        return isValid;
    }
    public void fetchDetails(){
        System.out.println("Passenger Name: " + dto.getPassengerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("From: " + dto.getDepartureCity());
        System.out.println("To: " + dto.getArrivalCity());
        System.out.println("Travel Date: " + dto.getTravelDate());
        System.out.println("Number of Passengers: " + dto.getNumberOfPassengers());
        System.out.println("Fare: " + dto.getFare());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

    }
}
