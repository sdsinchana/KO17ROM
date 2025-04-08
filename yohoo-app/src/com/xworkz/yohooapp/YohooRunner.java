package com.xworkz.yohooapp;

public class YohooRunner {


        public static void main(String[] args) {
            YohooDto dto = new YohooDto();

            dto.setDisplayName("Sinchana_SD");
            dto.setContactNumber("9876543210");
            dto.setMoodMessage("Feeling productive");
            dto.setActiveNow(true);
            dto.setComposingMessage(true);
            dto.setPendingNotifications(5);

            YohooApp app = new YohooApp();
            app.openMessenger(dto);
        }


}
