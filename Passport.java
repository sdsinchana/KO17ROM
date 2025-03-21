class Passport {
    
    public static void validatePassport(String cpvLocation, String dcdrLocation, String givenName, String surName, String dob, String email, String emailLoginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns, String captcha) {
        boolean isVerified;
        
        isVerified = isPassportValid(cpvLocation, dcdrLocation, givenName, surName, dob, email, emailLoginSame, loginId, pwd, confirmPwd, hintQues, hintAns, captcha);
        if (isVerified) {
            System.out.println("Passport validation successful");
        } else {
            System.out.println("Passport validation failed");
        }
    }
    
    public static boolean isPassportValid(String cpvLocation, String dcdrLocation, String givenName, String surName, String dob, String email, String emailLoginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns, String captcha) {
        boolean isValidPassport = false;
        boolean isCpvLocationValid = false;
        boolean isDcdrLocationValid = false;
        boolean isGivenNameValid = false;
        boolean isSurNameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false ;
        boolean isEmailLoginSameValid = false;
        boolean isLoginIdValid = false;
        boolean isPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isHintQuesValid = false;
        boolean isHintAnsValid = false;
        boolean isCaptchaValid = false;
		
		if (cpvLocation != null && !cpvLocation.isEmpty() && (cpvLocation == "PO" || cpvLocation == "po" || cpvLocation == "cpvd" || cpvLocation == "CPVD")  ) {
            isCpvLocationValid = true;
        } 
		else {
            System.out.println("CPV location is Invalid. Please provide a valid CPV location");
        }
		
		if (dcdrLocation != null && !dcdrLocation.isEmpty()) {
            isDcdrLocationValid = true;
        } 
		else {
            System.out.println("Passportdcdr location is Invalid. Please provide a valid Passportdcdr location");
        }
		
		if (givenName != null && !givenName.isEmpty()&& givenName.length() >= 3) {
            isGivenNameValid = true;
        } 
		else {
            System.out.println("Given name is Invalid. Please provide a valid Valid name");
        }
		
		if (surName != null && !surName.isEmpty()) {
            isSurNameValid = true;
        } 
		else {
            System.out.println("Surname is Invalid. Please provide a valid Surname ");
        }
		
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        } 
		else {
            System.out.println("DOB is Invalid. Please provide a valid Date of birth");
        }
		
		if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } 
		else {
            System.out.println("Email is Invalid. Please provide a valid Email");
        }
		
		if (emailLoginSame != null && !emailLoginSame.isEmpty()) {
            isEmailLoginSameValid = true;
        } 
		else {
            System.out.println("Email Login is Invalid. Please provide a valid Email Login");
        }
		
		if (loginId != null && !loginId.isEmpty()&& loginId != email) {
            isLoginIdValid = true;
        } 
		else {
            System.out.println("LoginId is Invalid. Please provide a valid LoginId");
        }
		
		if (pwd != null && !cpvLocation.isEmpty() pwd&&  pwd.length() >= 6 && pwd.length() <=16) {
            isPwdValid = true;
        } 
		else {
            System.out.println("Password is Invalid. Please provide a valid Password");
        }
		
		if (confirmPwd != null && !confirmPwd.isEmpty() && confirmPwd == pwd) {
            isConfirmPwdValid = true;
        } 
		else {
            System.out.println("Confirm password is Invalid. Please provide a valid confirm password");
        }
		
		if (hintQues != null && !hintQues.isEmpty()) {
            isHintQuesValid = true;
        } 
		else {
            System.out.println("Hint Question is Invalid. Please provide a valid Hint Question");
        }
		
		if (hintAns != null && !hintAns.isEmpty()) {
            isHintAnsValid = true;
        } 
		else {
            System.out.println("Hint Answer  is Invalid. Please provide a valid Hint Answer");
        }
		
		if (captcha != null && !captcha.isEmpty()) {
            isCaptchaValid = true;
        } 
		else {
            System.out.println("Captcha is Invalid. Please provide a valid Captcha");
        }
		
        
        if (isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid  == true && isEmailLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true && isHintQuesValid == true && isHintAnsValid == true && isCaptchaValid == true) {
            isValidPassport = true;
        }
        
        return isValidPassport;
    }
}

