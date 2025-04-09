package com.xworkz.yohooapp;

public class YohooApp {
YohooDto dto;
        public void openMessenger(YohooDto dto) {
            boolean isvalid;
            this.dto = dto;
            boolean isValid = isProfileValid(dto);
            if (isValid) {
                System.out.println("Opening Yohoo Messenger for you");
            }
            else {
                System.out.println("Failed to load Yohoo profile. Please verify details.");
            }
        }

        public boolean isProfileValid(YohooDto dto) {
            boolean isValid = true;

            if (dto.getDisplayName() == null || dto.getDisplayName().isEmpty()) {
                System.out.println("Display name cannot be empty.");
                isValid = false;
            }

            if (dto.getContactNumber() == null || dto.getContactNumber().isEmpty()) {
                System.out.println("Contact number is required.");
                isValid = false;
            }

            if (dto.getMoodMessage() == null || dto.getMoodMessage().isEmpty()) {
                System.out.println("Mood message cannot be empty.");
                isValid = false;
            }

            if (dto.getPendingNotifications() < 0) {
                System.out.println("Pending notifications count can't be negative.");
                isValid = false;
            }

            return isValid;
        }
        public void fetchDetails(){
            System.out.println("Display Name :"+dto.getDisplayName());
            System.out.println("Contact Number :"+dto.getContactNumber());
            System.out.println("Mood Message :"+dto.getMoodMessage());
            System.out.println("Pending Notifications :"+dto.getPendingNotifications());
        }


}
