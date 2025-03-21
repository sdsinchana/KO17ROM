class AmazonLogin {

    public static void login(String username, String password, String phoneNumber, String email) {
        boolean isValid = validateUserCredentials(username, password, phoneNumber, email);

        if (isValid == true) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public static boolean validateUserCredentials(String username, String password, String phoneNumber, String email) {
        boolean isValid = false;
		boolean isUserName= false;
		boolean isPassword = false;
		boolean isPhoneNumber = false;
		boolean isEmail = false;
		
        if (username != null && !uername.isEmpty() && username.length() > 3) {
			isUserName = true;
		}
		else{
            System.out.println("Username is Invalid. It must be at least 3 characters.");
            
        }

        if (password != null && !password.isEmpty() && password.length() > 6 && password.length()<16 ) {
			isPassword = true;
		}
		else{
            System.out.println("Password is Invalid. It must be at least 6 characters long.");
           
        }

        if (phoneNumber != null !phoneNumber.isEmpty() && phoneNumber.length()>0 && phoneNumber.length()==10) {
			isPhoneNumber = true;
		}
		else{
            System.out.println("Phone number is Invalid. It must be exactly 10 digits.");
            
        }

        if (email != null && !email.isEmpty() ) {
			isEmail = true;
		}
		else{
            System.out.println("Email is Invalid. Please provide a valid email address.");
           
        }
		if (isUserName==true && isPassword==true && isPhoneNumber==true && isEmail == true){
			isValid=true;
		}
		else{
			isValid = false;
		}

        return isValid;
    }
}

