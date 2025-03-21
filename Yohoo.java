class Yohoo{
    
    public static String authenticateUser(String username, String password, String email, String phoneNumber, String dob, String gender) {
        String authenticate = "null";
		boolean isValid;
        
        isValid = checkUserDetails(username, password, email, phoneNumber, dob, gender);
        if (isValid == true) {
            System.out.println("User authentication successful");
        } else {
            System.out.println("User authentication failed");
        }
		return authenticate;
    }
    
    public static boolean checkUserDetails(String username, String password, String email, String phoneNumber, String dob, String gender) {
        boolean isUserValid = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        
        
        if (username != null && !username.isEmpty() && username.length() >= 3) {
            isUsername = true;
        } 
		else {
            System.out.println("Username is Invalid. Please provide a valid Username");
        }
        
        if (password != null && !password.isEmpty() && password.length() >= 6 && password.length() <= 16) {
            isPassword = true;
        } 
		else {
            System.out.println("Password is Invalid. It must be at least 6 characters long");
        }
        
        if (email != null !email.isEmpty()) {
            isEmail = true;
        } 
		else {
            System.out.println("Email is Invalid. Please provide a valid Email");
        }
        
        if (phoneNumber != null !phoneNumber.isEmpty() && phoneNumber.length()>0 && phoneNumber.length() == 10) {
            isPhoneNumber = true;
        } 
		else {
            System.out.println("Phone number is Invalid. Please provide a valid Phone Number");
        }
        
       
        if (isUsername == true && isPassword == true && isEmail == true && isPhoneNumber == true ) {
            isUserValid = true;
        }
        
        return isUserValid;
    }
}

