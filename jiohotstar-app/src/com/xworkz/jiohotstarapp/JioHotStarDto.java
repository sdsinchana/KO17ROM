package com.xworkz.jiohotstarapp;

public class JioHotStarDto {

        private String showName;
        private String genre; // e.g., Drama, Action, Comedy
        private int duration; // in minutes
        private boolean isPremium;
        private boolean isLive;
        private double rating; // out of 10

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getShowName() {
            return showName;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        public void setPremium(boolean isPremium) {
            this.isPremium = isPremium;
        }

        public boolean isPremium() {
            return isPremium;
        }

        public void setLive(boolean isLive) {
            this.isLive = isLive;
        }

        public boolean getLive() {
            return isLive;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public double getRating() {
            return rating;
        }


}
