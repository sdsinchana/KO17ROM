class Spotify {
    
    public static void loginSpotify(String username, String password, String email, String phoneNumber, String otp, String subscriptionType) {
        boolean isAuthenticated;
        
        isAuthenticated = isAuthenticatedUser(username, password, email, phoneNumber, otp, subscriptionType);
        if (isAuthenticated == true) {
            System.out.println("Spotify login successful");
        } else {
            System.out.println("Spotify login failed");
        }
    }
    
    public static boolean isAuthenticatedUser(String username, String password, String email, String phoneNumber, String otp, String subscriptionType) {
        boolean isUserAuthenticated = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isOtpValid = false;
        boolean isSubscriptionTypeValid = false;
        
        if (username != null && !username.isEmpty()&& username.length() >= 3) {
            isUsernameValid = true;
        } 
		else {
            System.out.println("Username is Invalid. Please provide a valid Username");
        }
        
        if (password != null && !password.isEmpty()&& password.length() >= 6 && password.length() <= 16) {
            isPasswordValid = true;
        } 
		else {
            System.out.println("Password is Invalid. It must be between 6 and 16 characters long");
        }
        
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } 
		else {
            System.out.println("Email is Invalid. Please provide a valid Email");
        }
        
        if (phoneNumber != null && !phoneNumber.isEmpty()&& phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } 
		else {
            System.out.println("Phone number is Invalid. Please provide a valid Phone Number");
        }
        
        if (otp != null && !otp.isEmpty()&& otp.length() == 6) {
            isOtpValid = true;
        } else {
            System.out.println("OTP is Invalid. Please provide a valid OTP");
        }
        
        if (subscriptionType != null && !subscriptionType.isEmpty()) {
            isSubscriptionTypeValid = true;
        } else {
            System.out.println("Subscription Type is Invalid. Please provide a valid Subscription Type");
        }
        
        if (isUsernameValid && isPasswordValid && isEmailValid && isPhoneNumberValid && isOtpValid && isSubscriptionTypeValid) {
            isUserAuthenticated = true;
        }
        
        return isUserAuthenticated;
    }
}

