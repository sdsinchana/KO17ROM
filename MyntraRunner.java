class MyntraRunner {
    public static void main(String args[]) {
        String username = "Sinchana S D";
        String password = "sinchu@789";
        String email = "sinchanasd@gmail.com";
        String phoneNumber = "7676496955";
        String otp = "776074";
        String location = "India";
        
        Myntra.authenticateUser(username, password, email, phoneNumber, otp, location);
    }
}