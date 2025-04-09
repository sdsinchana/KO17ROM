package com.xworkz.twitterapp;

public class TwitterRunner {


        public static void main(String[] args) {
            TwitterDto dto = new TwitterDto();

            dto.setUserName("sinchana_sd");
            dto.setTweetContent("Excited to explore Java Spring Boot.");
            dto.setTweetLength(43);
            dto.setLocation("Bangalore");
            dto.setIsVerified(true);
            dto.setFollowersCount(1500);

            TwitterApp app = new TwitterApp();
            app.postTweet(dto);
            app.fetchDetails();
        }
    

}
