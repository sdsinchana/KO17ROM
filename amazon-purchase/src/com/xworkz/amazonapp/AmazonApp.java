package com.xworkz.amazonapp;

public class AmazonApp {
    AmazonDto dto;

    public void UserRegistered(AmazonDto amazonDto) {
        boolean isValid = validateUser(amazonDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = amazonDto;
            System.out.println("Registration done successfully");
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(AmazonDto amazonDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (amazonDto.getFullName() != null && !amazonDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (amazonDto.getMobileNumber() != null && !amazonDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (amazonDto.getEmail() != null && amazonDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (amazonDto.getPassword() != null && !amazonDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (amazonDto.getShippingAddress() != null && !amazonDto.getShippingAddress().isEmpty())
            isShippingAddressValid = true;
        else
            System.out.println("Invalid shipping address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isShippingAddressValid)
            isvalid = true;

        return isvalid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User shipping address is: " + dto.getShippingAddress());
        System.out.println("User password is: " + dto.getPassword());
    }

    }


