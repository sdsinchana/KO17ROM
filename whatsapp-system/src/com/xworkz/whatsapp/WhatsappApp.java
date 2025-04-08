package com.xworkz.whatsapp;

public class WhatsappApp {

        public void launchChat(WhatsappDto dto) {
            boolean isValid = isProfileValid(dto);
            if (isValid) {
                System.out.println("WhatsApp profile loaded successfully!");
            } else {
                System.out.println("Failed to load WhatsApp profile. Please check the details.");
            }
        }

        public boolean isProfileValid(WhatsappDto dto) {
            boolean isValid = true;

            if (dto.getUserName() == null || dto.getUserName().isEmpty()) {
                System.out.println("Username cannot be empty.");
                isValid = false;
            }

            if (dto.getPhoneNumber() == null || dto.getPhoneNumber().length() != 10) {
                System.out.println("Phone number must be 10 digits.");
                isValid = false;
            }

            if (dto.getStatusMessage() == null || dto.getStatusMessage().isEmpty()) {
                System.out.println("Status message cannot be empty.");
                isValid = false;
            }

            if (dto.getUnreadMessagesCount() < 0) {
                System.out.println("Unread messages count cannot be negative.");
                isValid = false;
            }

            // Optional info
            if (dto.isOnline()) {
                System.out.println(dto.getUserName() + " is currently online.");
            }

            if (dto.isTyping()) {
                System.out.println(dto.getUserName() + " is typing...");
            }

            return isValid;
        }


}
