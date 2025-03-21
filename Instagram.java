// return type is String and declaration and initiliazation is dine at once


class Instagram {
    
    public static String loginUser(String username, String password, String email, String phoneNumber, String dob, String gender) {
        String userLogin = "null";
		boolean isValid;
        
        isValid = isValidUser(username, password, email, phoneNumber, dob, gender);
        if (isValid == true) {
            System.out.println("Instagram login successful");
        } 
		else {
            System.out.println("Instagram login failed");
        }
		return userLogin;
    }
    
    public static boolean isValidUser(String username, String password, String email, String phoneNumber, String dob, String gender) {
        boolean isUserValid = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        
        if (username != null && !username.isEmpty() && username.length() >= 3) {
            isUsernameValid = true;
        } 
		else {
            System.out.println("Username is Invalid. Please provide a valid Username");
        }
        
        if (password != null && !password.isEmpty() && password.length() >= 6 && password.length()<=16) {
            isPasswordValid = true;
        } 
		else {
            System.out.println("Password is Invalid. It must be at least 6 characters long");
        }
        
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } 
		else {
            System.out.println("Email is Invalid. Please provide a valid Email");
        }
        
        if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10 && phoneNumber.length()>0) {
            isPhoneNumberValid = true;
        } 
		else {
            System.out.println("Phone number is Invalid. Please provide a valid Phone Number");
        }
        
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        } 
		else {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth");
        }
        
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        } 
		else {
            System.out.println("Gender is Invalid. Please provide a valid Gender");
        }
        
        if (isUsernameValid == true && isPasswordValid == true && isEmailValid == true && isPhoneNumberValid ==true && isDobValid == true && isGenderValid == true) {
            isUserValid = true;
        }
        
        return isUserValid;
    }
}


