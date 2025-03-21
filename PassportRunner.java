class PassportRunner {
    public static void main(String args[]) {
        String cpvLocation = "cpvd";
        String dcdrLocation = "Bengaluru";
        String givenName = "Sinchana";
        String surName = "S D";
        String dob = "28/02/2003";
        String email = "sinchanasd241@gmail.com";
        String emailLoginSame = "no";
        String loginId = "sinchanasd241@gmail.com";
        String pwd = "sinch123";
        String confirmPwd = "sinch123";
        String hintQues = "Color";
        String hintAns = "Pink";
        String captcha = "YRDQ7EF";
        
        Passport.validatePassport(cpvLocation, dcdrLocation, givenName, surName, dob, email, emailLoginSame, loginId, pwd, confirmPwd, hintQues, hintAns, captcha);
    }
}