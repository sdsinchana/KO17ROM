package com.xworkz.jiohotstarapp;

public class JioHotStarApp {
JioHotStarDto dto;
        public void streamContent(JioHotStarDto dto) {
            boolean isvalid;
            boolean isValid = isContentValid(dto);
            if (isValid) {
                isvalid =true;
                this.dto = dto;
                System.out.println("Now streaming on JioHotStar ");
            }
            else {
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
        public void fetchDetails(){
            System.out.println("Show Name :"+dto.getShowName());
            System.out.println("Genre :"+dto.getGenre());
            System.out.println("Duration :"+dto.getDuration());
            System.out.println("Rating :"+dto.getRating());

        }



}
