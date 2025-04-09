package com.xworkz.instagramapp;

public class InstagramApp {

InstagramDto dto;
        public void registerProfile(InstagramDto instagram) {
            boolean isvalid = false;
            boolean isValid = isProfileValid(instagram);

            if (isValid) {
                isvalid = true;
                dto = instagram;
                System.out.println("Instagram profile created successfully!");
            } else {
                System.out.println("Profile creation failed. Please check the details.");
            }
        }

        public boolean isProfileValid(InstagramDto instagram) {
            boolean isValid = true;

            if (instagram.getUserName() == null || instagram.getUserName().isEmpty()) {
                System.out.println("Invalid username.");
                isValid = false;
            }

            if (instagram.getFullName() == null || instagram.getFullName().isEmpty()) {
                System.out.println("Full name cannot be empty.");
                isValid = false;
            }

            if (instagram.getBio() == null || instagram.getBio().isEmpty()) {
                System.out.println("Bio cannot be empty.");
                isValid = false;
            }

            if (instagram.getFollowersCount() < 0) {
                System.out.println("Followers count cannot be negative.");
                isValid = false;
            }

            if (instagram.getFollowingCount() < 0) {
                System.out.println("Following count cannot be negative.");
                isValid = false;
            }

            return isValid;
        }
        public void fetchDetails(){
            System.out.println("User Name :"+dto.getUserName());
            System.out.println("Full Name :"+dto.getFullName());
            System.out.println("Bio of Username :"+dto.getBio());
            System.out.println("Followers Count :"+dto.getFollowersCount());
            System.out.println("Following Count :"+dto.getFollowingCount());

        }
    }


