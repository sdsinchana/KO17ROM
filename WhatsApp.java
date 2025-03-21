// return type is String , 1st declaration of string type and then re-init it in if-else condition


class WhatsApp {
    
    public static String  loginUser(String phoneNumber, String otp, String deviceId, String appVersion) {
        String userLogin;
		boolean isValid;
        
        isValid = isValidUser(phoneNumber, otp, deviceId, appVersion);
        if (isValid == true) {
			userLogin="WhatsApp login successful";
            System.out.println("WhatsApp login successful");
        } else {
            System.out.println("WhatsApp login failed");
			userLogin="WhatsApp login unsuccessful";
        }
		return userLogin;
    }
    
    public static boolean isValidUser(String phoneNumber, String otp, String deviceId, String appVersion) {
        boolean isUserValid = false;
        boolean isPhoneNumberValid = false;
        boolean isOtpValid = false;
        boolean isDeviceIdValid = false;
        boolean isAppVersionValid = false;
        
        if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } 
		else {
            System.out.println("Phone number is Invalid. Please provide a valid Phone Number");
        }
        
        if (otp != null && !otp.isEmpty() && otp.length() == 6) {
            isOtpValid = true;
        } 
		else {
            System.out.println("OTP is Invalid. Please provide a valid OTP");
        }
        
        if (deviceId != null && !deviceId.isEmpty()) {
            isDeviceIdValid = true;
        } 
		else {
            System.out.println("Device ID is Invalid. Please provide a valid Device ID");
        }
        
        if (appVersion != null && !appVersion.isEmpty()) {
            isAppVersionValid = true;
        } 
		else {
            System.out.println("App Version is Invalid. Please provide a valid App Version");
        }
        
        if (isPhoneNumberValid == true && isOtpValid == true && isDeviceIdValid == true && isAppVersionValid==true) {
            isUserValid = true;
        }
        
        return isUserValid;
    }
}

