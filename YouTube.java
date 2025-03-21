class YouTube {
    
    public static String login(String username, String password, String email, String phoneNumber, String dob, String gender) {
        String loginYouTube =  null;
		boolean ref;
        
        ref = validateUserCredentials(username, password, email, phoneNumber, dob, gender);
        if (ref == true) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful");
        }
		return loginYouTube;
    }
    
    public static boolean validateUserCredentials(String username, String password, String email, String phoneNumber, String dob, String gender) {
        boolean userValidate = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isDob = false;
        boolean isGender = false;
        
        if (username != null && !username.isEmpty() && username.length() >= 3) {
            isUsername = true;
        } 
		else {
            System.out.println("Username is Invalid. Please provide a valid Username");
        }
        
        if (password != null && !password.isEmpty() && password.length() >= 6 && password.length()<=16) {
            isPassword = true;
        } 
		else {
            System.out.println("Password is Invalid. It must be at least 6 characters long");
        }
        
        if (email != null && !email.isEmpty()) {
            isEmail = true;
        } 
		else {
            System.out.println("Email is Invalid. Please provide a valid Email");
        }
        
        if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length()>0 && phoneNumber.length() == 10) {
            isPhoneNumber = true;
        } 
		else {
            System.out.println("Phone number is Invalid. Please provide a valid Phone Number");
        }
        
        if (dob != null && !dob.isEmpty()) {
            isDob = true;
        } 
		else {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth");
        }
        
        if (gender != null && !gender.isEmpty()) {
            isGender = true;
        } 
		else {
            System.out.println("Gender is Invalid. Please provide a valid Gender");
        }
        
        if (isUsername == true && isPassword == true && isEmail == true && isPhoneNumber == true && isDob == true && isGender == true) {
            userValidate = true;
        }
        
        return userValidate;
    }
}

