class YohooRunner {
    public static void main(String args[]) {
        String username = "Sinchana SD";
        String password = "sinch123";
        String email = "sinchana2332@gmail.com";
        String phoneNumber = "5987469321";
        String dob = "28/10/2003";
        String gender = "Female";  
        Yohoo.authenticateUser(username, password, email, phoneNumber, dob, gender);
    }
}