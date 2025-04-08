package com.xworkz.yohooapp;

public class YohooApp {

        public void openMessenger(YohooDto dto) {
            boolean isValid = isProfileValid(dto);
            if (isValid) {
                System.out.println("Opening Yohoo Messenger for " + dto.getDisplayName() );

                if (dto.isActiveNow()) {
                    System.out.println(dto.getDisplayName() + " is currently active ");
                    if (dto.isComposingMessage()) {
                        System.out.println(dto.getDisplayName() + " is typing...");
                    }
                } else {
                    System.out.println(dto.getDisplayName() + " is currently offline ");
                }

                if (dto.getPendingNotifications() > 0) {
                    System.out.println("You have " + dto.getPendingNotifications() + " new notifications");
                }

                System.out.println("Mood: \"" + dto.getMoodMessage() + "\"");
            } else {
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


}
