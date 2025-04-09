package com.xworkz.whatsapp;

public class WhatsappApp {
WhatsappDto dto;
        public void launchChat(WhatsappDto dto) {
            boolean isvalid;
            boolean isValid = isProfileValid(dto);
            if (isValid) {
                isvalid =true;
                this.dto=dto;
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



            return isValid;
        }

        public  void fetchDetails(){
            System.out.println("User Name :"+dto.getUserName());
            System.out.println("Phone Number :"+dto.getPhoneNumber());
            System.out.println("Status Message :"+dto.getStatusMessage());
            System.out.println("Unread Message Count :"+dto.getUnreadMessagesCount());
        }


}
