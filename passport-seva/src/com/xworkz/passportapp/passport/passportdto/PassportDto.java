package com.xworkz.passportapp.passport.passportdto;

import com.xworkz.passportapp.passport.constants.CpvLocation;
import com.xworkz.passportapp.passport.constants.DcdrLocation;
import com.xworkz.passportapp.passport.constants.CpvLocation;
import com.xworkz.passportapp.passport.constants.DcdrLocation;

public class PassportDto {

    private CpvLocation location;
    private DcdrLocation area;
    private   String firstName;
    private  String lastName;
    private String birthDate;
    private String email;
    private boolean isEmailSame;
    private String userId;
    private String password;
    private String confirmPassword;
    private String securityQuestion;
    private String securityAnswer;
    private String captcha ;

    public void setLocation(CpvLocation location) {
        this.location = location;
    }

    public CpvLocation getLocation() {
        return location;
    }

    public void setArea(DcdrLocation area) {
        this.area = area;
    }

    public DcdrLocation getArea() {
        return area;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIsEmailSame(boolean isEmailSame) {
        this.isEmailSame = isEmailSame;
    }

    public boolean getIsEmailSame() {
        return isEmailSame;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
