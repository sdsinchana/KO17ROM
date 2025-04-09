package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.constants.Gender;
import com.xworkz.snapchatapp.snapchatdto.SnapchatDto;
import com.xworkz.snapchatapp.generatesnapchat.Snapchat;

public class SnapchatRunner {

    public static void main(String[] args) {



        SnapchatDto snapchatDto = new SnapchatDto();
        snapchatDto.setFirstName("Sinchana ");
        snapchatDto.setLastName("S D");
        snapchatDto.setDob("28/02/2003");
        snapchatDto.setGender(Gender.female);
        snapchatDto.setEmail("sinchana.sd@snapchat.com");
        snapchatDto.setMobile("9876543210");
        snapchatDto.setUserName("sinchana snap");
        snapchatDto.setPassword("snap@sinch");



        Snapchat snapchat = new Snapchat();
        snapchat.newAccount(snapchatDto);
        snapchat.fetchDetails();
    }
}
