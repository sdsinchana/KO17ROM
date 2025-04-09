package com.xworkz.twitterapp;

public class TwitterApp {
 TwitterDto dto;

        public void postTweet(TwitterDto dto) {
            boolean isvalid = false;
            boolean isValid = isTweetValid(dto);
            if (isValid) {
                isvalid = true;
                this.dto= dto;
                System.out.println("Tweet posted successfully!");
            } else {
                System.out.println("Tweet failed. Please check the tweet details.");
            }
        }

        public boolean isTweetValid(TwitterDto dto) {
            boolean isValid = true;

            if (dto.getUserName() == null || dto.getUserName().isEmpty()) {
                System.out.println("Username cannot be empty.");
                isValid = false;
            }

            if (dto.getTweetContent() == null || dto.getTweetContent().isEmpty()) {
                System.out.println("Tweet content cannot be empty.");
                isValid = false;
            }

            if (dto.getTweetLength() <= 0 || dto.getTweetLength() > 280) {
                System.out.println("Tweet length must be between 1 and 280 characters.");
                isValid = false;
            }

            if (dto.getLocation() == null || dto.getLocation().isEmpty()) {
                System.out.println("Location is required.");
                isValid = false;
            }

            if (dto.getFollowersCount() < 0) {
                System.out.println("Followers count cannot be negative.");
                isValid = false;
            }

            if (dto.getIsVerified()) {
                System.out.println("User is verified.");
            } else {
                System.out.println("User is not verified.");
            }

            return isValid;
        }
        // to print the details in the console
        public  void  fetchDetails(){
            System.out.println("User Name :"+dto.getUserName());
            System.out.println("Twitter Content :"+dto.getTweetContent());
            System.out.println("Twitter Length :"+dto.getTweetLength());
            System.out.println("Location :"+dto.getLocation());
            System.out.println("Followers Count :"+dto.getFollowersCount());
            System.out.println("Verification :"+dto.getIsVerified());
        }

}
