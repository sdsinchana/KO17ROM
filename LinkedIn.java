//return type is void , so no return type in loginUser method

class LinkedIn {
    
    public static void loginUser(String username, String password, String email, String phoneNumber, String otp) {
        boolean isValid;
        
        isValid = isValidUser(username, password, email, phoneNumber, otp);
        if (isValid == true) {
            System.out.println("LinkedIn login successful");
        } else {
            System.out.println("LinkedIn login failed");
        }
    }
    
	
	//vadidation /verify
    public static boolean isValidUser(String username, String password, String email, String phoneNumber, String otp) {
        boolean isUserValid = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isOtpValid = false;
        
        if (username != null && !username.isEmpty() && username.length() >= 3) {
            isUsernameValid = true;
        } 
		else {
            System.out.println("Username is Invalid. Please provide a valid Username");
        }
        
        if (password != null && !password.isEmpty() && password.length() >= 6 && password.length() <= 16) {
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
        
        if (isUsernameValid == true && isPasswordValid == true && isEmailValid == true && isPhoneNumberValid ==true && isOtpValid == true) {
            isUserValid = true;
        }
        
        return isUserValid;
    }
}


