class WhatsAppRunner {
    public static void main(String args[]) {
        String phoneNumber = "9876543210";
        String otp = "123456";
        String deviceId = "RealMe 9 5G";
        String appVersion = "2.23.15";
        
        WhatsApp.loginUser(phoneNumber, otp, deviceId, appVersion);
    }
}