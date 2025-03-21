class SpotifyRunner {
    public static void main(String args[]) {
        String username = "Sinchana";
        String password = "SpotifyRocks2025";
        String email = "musiclover@spotify.com";
        String phoneNumber = "8123456789";
        String otp = "123456";
        String subscriptionType = "Premium";
		Spotify.loginSpotify(username, password, email, phoneNumber, otp, subscriptionType);
		}
}