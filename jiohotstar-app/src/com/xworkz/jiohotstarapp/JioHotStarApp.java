package com.xworkz.jiohotstarapp;

public class JioHotStarApp {

        public void streamContent(JioHotStarDto dto) {
            boolean isValid = isContentValid(dto);
            if (isValid) {
                System.out.println("Now streaming: " + dto.getShowName());
                System.out.println("Genre: " + dto.getGenre());
                System.out.println("Duration: " + dto.getDuration() + " mins");

                if (dto.getLive()) {
                    System.out.println("LIVE broadcast is ongoing!");
                } else {
                    System.out.println("On-demand streaming available.");
                }

                if (dto.isPremium()) {
                    System.out.println("Premium content - Subscription required.");
                } else {
                    System.out.println("Free to watch.");
                }

                System.out.println("Rating: " + dto.getRating() + "/10");
            } else {
                System.out.println("Cannot stream. Please check content details.");
            }
        }

        public boolean isContentValid(JioHotStarDto dto) {
            boolean isValid = true;

            if (dto.getShowName() == null || dto.getShowName().isEmpty()) {
                System.out.println("Show name cannot be empty.");
                isValid = false;
            }

            if (dto.getGenre() == null || dto.getGenre().isEmpty()) {
                System.out.println("Genre is required.");
                isValid = false;
            }

            if (dto.getDuration() <= 0) {
                System.out.println("Duration must be greater than zero.");
                isValid = false;
            }

            if (dto.getRating() < 0 || dto.getRating() > 10) {
                System.out.println("Rating must be between 0 and 10.");
                isValid = false;
            }

            return isValid;
        }


}
