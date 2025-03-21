class AmazonLogin {

    public static void login(String username, String password, String phoneNumber, String email) {
        boolean isValid = validateUserCredentials(username, password, phoneNumber, email);

        if (isValid) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public static boolean validateUserCredentials(String username, String password, String phoneNumber, String email) {
        boolean isValid = true;

        if (username == null || username.length() < 3) {
            System.out.println("Username is Invalid. It must be at least 3 characters long.");
            isValid = false;
        }

        if (password == null || password.length() < 6) {
            System.out.println("Password is Invalid. It must be at least 6 characters long.");
            isValid = false;
        }

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) { 
            System.out.println("Phone number is Invalid. It must be exactly 10 digits.");
            isValid = false;
        }

        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("Email is Invalid. Please provide a valid email address.");
            isValid = false;
        }

        return isValid;
    }
}

