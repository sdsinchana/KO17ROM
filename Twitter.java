class Twitter {
    
    public static void loginAccount(String userHandle, String passcode, String mailAddress, String contactNumber, String verificationCode, String country) {
        boolean isVerified;
        
        isVerified = isVerifiedUser(userHandle, passcode, mailAddress, contactNumber, verificationCode, country);
        if (isVerified == true) {
            System.out.println("Twitter login successful");
        } 
		else {
            System.out.println("Twitter login failed");
        }
    }
    
    public static boolean isVerifiedUser(String userHandle, String passcode, String mailAddress, String contactNumber, String verificationCode, String country) {
        boolean isUserVerified = false;
        boolean isUserHandleValid = false;
        boolean isPasscodeValid = false;
        boolean isMailAddressValid = false;
        boolean isContactNumberValid = false;
        boolean isVerificationCodeValid = false;
        boolean isCountryValid = false;
        
        if (userHandle != null && !userHandle.isEmpty()&& userHandle.length() >= 3) {
            isUserHandleValid = true;
        } 
		else {
            System.out.println("User handle is Invalid. Please provide a valid User Handle");
        }
        
        if (passcode != null && !passcode.isEmpty()&& passcode.length() >= 6 && passcode.length() <= 16) {
            isPasscodeValid = true;
        } 
		else {
            System.out.println("Passcode is Invalid. It must be between 6 and 16 characters long");
        }
        
        if (mailAddress != null && !mailAddress.isEmpty()) {
            isMailAddressValid = true;
        } 
		else {
            System.out.println("Mail Address is Invalid. Please provide a valid Mail Address");
        }
        
        if (contactNumber != null && !contactNumber.isEmpty()&& contactNumber.length() == 10) {
            isContactNumberValid = true;
        } 
		else {
            System.out.println("Contact number is Invalid. Please provide a valid Contact Number");
        }
        
        if (verificationCode != null && !verificationCode.isEmpty()&& verificationCode.length() == 6) {
            isVerificationCodeValid = true;
        } 
		else {
            System.out.println("Verification Code is Invalid. Please provide a valid Verification Code");
        }
        
        if (country != null && !country.isEmpty()) {
            isCountryValid = true;
        }
		else {
            System.out.println("Country is Invalid. Please provide a valid Country");
        }
        
        if (isUserHandleValid == true && isPasscodeValid == true && isMailAddressValid == true && isContactNumberValid == true && isVerificationCodeValid == true && isCountryValid == true) {
            isUserVerified = true;
        }
        
        return isUserVerified;
    }
}


