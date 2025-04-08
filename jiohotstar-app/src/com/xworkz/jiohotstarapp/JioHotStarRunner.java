package com.xworkz.jiohotstarapp;

public class JioHotStarRunner {


        public static void main(String[] args) {
            JioHotStarDto dto = new JioHotStarDto();

            dto.setShowName("Sinchana Diaries");
            dto.setGenre("Drama");
            dto.setDuration(45); // duration in minutes
            dto.setLive(false);
            dto.setPremium(true);
            dto.setRating(8.7);

            JioHotStarApp app = new JioHotStarApp();
            app.streamContent(dto);
        }
    }


