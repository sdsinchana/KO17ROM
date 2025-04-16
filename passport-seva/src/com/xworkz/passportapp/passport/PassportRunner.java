package com.xworkz.passportapp.passport;


//process of grouping data into single unit is called encapsulation;

import com.xworkz.passportapp.passport.constants.CpvLocation;
import com.xworkz.passportapp.passport.constants.DcdrLocation;
import com.xworkz.passportapp.passport.generatepassport.PassportSeva;
import com.xworkz.passportapp.passport.passportdto.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto=new PassportDto();
        passportdto.setLocation(CpvLocation.PassportOffice);
        passportdto.setArea(DcdrLocation.Bengaluru);
        passportdto.setFirstName("Sinchana");
        passportdto.setLastName("S D");
        passportdto.setBirthDate("28/02/2003");
        passportdto.setEmail("sinchana22@gmail.com");
        passportdto.setEmailLoginSame(true);
        passportdto.setUserId("sinchana22@gmail.com");
        passportdto.setPassword("sinchu123");
        passportdto.setConfirmPassword("sinchu123");
        passportdto.setSecurityQuestion("question");
        passportdto.setSecurityAnswer("answer");
        passportdto.setCaptcha("AB7123");

        PassportSeva passportseva=new PassportSeva();
        passportseva.userRegisterd(passportdto);




    }
}

