package com.xworkz.whatsapp;

public class WhatsappRunner {
    public static void main(String[] args) {
            WhatsappDto dto = new WhatsappDto();

            dto.setUserName("Sinchana");
            dto.setStatusMessage("Busy online");
            dto.setPhoneNumber("9876543210");
            dto.setIsOnline(true);
            dto.setIsTyping(false);
            dto.setUnreadMessagesCount(3);

            WhatsappApp app = new WhatsappApp();
            app.launchChat(dto);
            app.fetchDetails();
        }


}
