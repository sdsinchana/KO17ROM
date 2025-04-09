package com.xworkz.instagramapp;

public class InstagramRunner {

        public static void main(String[] args) {
            InstagramDto instagram = new InstagramDto();

            instagram.setUserName("sinchana_28");
            instagram.setFullName("Sinchana S D");
            instagram.setBio("Coder | Reader | Explorer ");
            instagram.setFollowersCount(1200);
            instagram.setFollowingCount(350);
            instagram.setIsPrivate(false);

            InstagramApp instagramApp = new InstagramApp();
            instagramApp.registerProfile(instagram);
            instagramApp.fetchDetails();
        }
    }


