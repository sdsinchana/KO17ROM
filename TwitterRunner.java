class TwitterRunner {
    public static void main(String args[]) {
        String userHandle = "Rakshitha";
        String passcode = "raksh789";
        String mailAddress = "rakshu123ddf@twitter.com";
        String contactNumber = "7896584632";
        String verificationCode = "546932";
        String country = "India";
        
        Twitter.loginAccount(userHandle, passcode, mailAddress, contactNumber, verificationCode, country);
    }
}