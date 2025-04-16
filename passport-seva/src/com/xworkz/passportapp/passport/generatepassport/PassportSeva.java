package com.xworkz.passportapp.passport.generatepassport;



import com.xworkz.passportapp.passport.passportdto.PassportDto;

public class PassportSeva {



    public void userRegisterd(PassportDto passportDto){
        boolean isUserValid=userValid(passportDto);
        if(isUserValid){
            System.out.println("user registration successfull");

        }
        else
            System.out.println("user not registerd");
    }
    public boolean userValid( PassportDto passportDto){
        boolean isUserValid=false;
        boolean isAreaValid=false;
        boolean isLocationvalid=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isBirthDateValid=false;
        boolean isEmailValid=false;
        boolean isEmailLoginSame = false;
        boolean isUserIdValid=false;
        boolean isPasswordValid=false;
        boolean isConfirmPasswordValid=false;
        boolean issecurityQuetionValid=false;
        boolean isSecurityAnswervalid=false;
        boolean isCaptchaValid=false;
        if(passportDto.getArea()!=null)
            isAreaValid=true;
        else
            System.out.println("the area is invalid");
        if( passportDto.getLocation()!=null)
            isLocationvalid=true;
        else
            System.out.println("location enters is invalid");
        if(passportDto.getFirstName()!=null&& !passportDto.getFirstName().isEmpty())
            isFirstNameValid=true;
        else
            System.out.println("please enter a valid first name");
        if(passportDto.getLastName()!=null&& !passportDto.getLastName().isEmpty())
            isLastNameValid=true;
        else
            System.out.println("please enter a valid last name");
        if(passportDto.getBirthDate()!=null&&!passportDto.getBirthDate().isEmpty())
            isBirthDateValid=true;
        else
            System.out.println("please enter a valid birthdate");
        if(passportDto.getEmail()!=null){
            isEmailValid=true;
        }
        else
            System.out.println("please enter a valid email id");

        if(passportDto.isEmailLoginSame()!= false){
            isEmailLoginSame = true;
        }
        else{
            System.out.println("Email is not same as Login Id ...");
            return isEmailLoginSame;
        }
        if(passportDto.getEmail()==passportDto.getUserId() && passportDto.getUserId()!=null)
            isUserIdValid=true;
        else
            System.out.println("invalid user id");
        if(passportDto.getPassword()!=null)
            isPasswordValid=true;
        else
            System.out.println("please enter a valid password");
        if(passportDto.getConfirmPassword()!=null&& passportDto.getPassword().equals(passportDto.getConfirmPassword()))
            isConfirmPasswordValid=true;
        else
            System.out.println("password and confirm password are not matching");
        if(passportDto.getSecurityQuestion()!=null)
            issecurityQuetionValid=true;
        else
            System.out.println("this field can not be null");
        if(passportDto.getSecurityAnswer()!=null)
            isSecurityAnswervalid=true;
        else
            System.out.println("this field can not be null");
        if(passportDto.getCaptcha()!=null)
            isCaptchaValid=true;
        else
            System.out.println("this field can not be null");

        if(isAreaValid&& isLocationvalid&& isFirstNameValid&& isLastNameValid &&isBirthDateValid&&isEmailValid&&isUserIdValid&&isPasswordValid&& isConfirmPasswordValid&&issecurityQuetionValid && isSecurityAnswervalid&& isCaptchaValid)
            isUserValid=true;
        return isUserValid;
    }

}
