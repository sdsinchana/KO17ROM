package com.xworkz.facebookapp;

import com.xworkz.facebookapp.constants.Gender;
import com.xworkz.facebookapp.facebookdto.FacebookDto;
import com.xworkz.facebookapp.generatefacebook.Facebook;

public class FacebookRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");
        FacebookDto facebookDto = new FacebookDto();
        facebookDto.setFirstName("Menaka");
        facebookDto.setLastName("Pooja");
        facebookDto.setDob("12/04/2006");
        facebookDto.setGender(Gender.Female);
        facebookDto.setEmail("menakapooja@gmail.com");
        facebookDto.setMobile("9876543210");
        facebookDto.setUserName("menaka");
        facebookDto.setPassword("menaka@123");


        System.out.println("The First Name: " + facebookDto.getFirstName());
        System.out.println("The Last Name: " + facebookDto.getLastName());
        System.out.println("The DOB: " + facebookDto.getDob());
        System.out.println("The Gender: " + facebookDto.getGender());
        System.out.println("The Email: " + facebookDto.getEmail());
        System.out.println("The Mobile: " + facebookDto.getMobile());
        System.out.println("The Username: " + facebookDto.getUserName());
        System.out.println("The Password: " + facebookDto.getPassword());

        System.out.println("----------------------------------");

        Facebook facebook = new Facebook();
        facebook.newAccount(facebookDto);
    }
}
