package com.xworkz.facebookapp.generatefacebook;

import com.xworkz.facebookapp.constants.Gender;
import com.xworkz.facebookapp.facebookdto.FacebookDto;

public class Facebook {
    FacebookDto dto;

    public boolean newAccount(FacebookDto facebookDto) {

        boolean isUserRegistered = false;
        boolean userValidated = validateAccount(facebookDto);
        if (userValidated) {
            isUserRegistered = true;
            dto = facebookDto;
            System.out.println("User Details Valid");
        } else {
            System.out.println("User details invalid");
        }
        return isUserRegistered;
    }

    public boolean validateAccount(FacebookDto facebookDto) {

        boolean userValidated = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean userNameValid = false;

        if (facebookDto.getFirstName() != null && !facebookDto.getFirstName().isEmpty()) {
            firstNameValid = true;
        } else {
            System.out.println("Invalid First Name!!!!");
        }

        if (facebookDto.getLastName() != null && !facebookDto.getLastName().isEmpty()) {
            lastNameValid = true;
        } else {
            System.out.println("Invalid Last Name!!!!");
        }

        if (facebookDto.getDob() != null && !facebookDto.getDob().isEmpty()) {
            dobValid = true;
        } else {
            System.out.println("Invalid Date of Birth!!!!");
        }

        if (facebookDto.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!!!!");
        }

        if (facebookDto.getEmail() != null && !facebookDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (facebookDto.getMobile() != null && !facebookDto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile Number!!!!");
        }

        if (facebookDto.getPassword() != null && !facebookDto.getPassword().isEmpty()) {
            passwordValid = true;
        } else {
            System.out.println("Invalid Password!!!!");
        }

        if (facebookDto.getUserName() != null && !facebookDto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!!!");
        }

        if (firstNameValid && lastNameValid && dobValid && genderValid && emailValid &&
                mobileValid && passwordValid && userNameValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void fetchDetails() {
        System.out.println("The First Name: " + dto.getFirstName());
        System.out.println("The Last Name: " + dto.getLastName());
        System.out.println("The DOB: " + dto.getDob());
        System.out.println("The Gender: " + dto.getGender());
        System.out.println("The Email: " + dto.getEmail());
        System.out.println("The Mobile: " + dto.getMobile());
        System.out.println("The Username: " + dto.getUserName());
        System.out.println("The Password: " + dto.getPassword());
    }
}
