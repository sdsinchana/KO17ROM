package com.xworkz.youtubeapp;

public class YouTubeApp {
YouTubeDto dto;

        public void playVideo(YouTubeDto dto) {
            boolean isvalid;
            boolean isValid = isVideoValid(dto);
            if (isValid) {
                isvalid = true;
                this.dto=dto;
                System.out.println("Now playing on channel ");
            }
            else {
                System.out.println("Failed to load video. Please check video details.");
            }
        }

        public boolean isVideoValid(YouTubeDto dto) {
            boolean isValid = true;

            if (dto.getChannelName() == null || dto.getChannelName().isEmpty()) {
                System.out.println("Channel name cannot be empty.");
                isValid = false;
            }

            if (dto.getVideoTitle() == null || dto.getVideoTitle().isEmpty()) {
                System.out.println("Video title is required.");
                isValid = false;
            }

            if (dto.getCategory() == null || dto.getCategory().isEmpty()) {
                System.out.println("Video category is missing.");
                isValid = false;
            }

            if (dto.getVideoLength() <= 0) {
                System.out.println("Video length must be greater than zero.");
                isValid = false;
            }

            if (dto.getSubscriberCount() < 0) {
                System.out.println("Subscriber count cannot be negative.");
                isValid = false;
            }

            return isValid;
        }
        public void fetchDetails(){
            System.out.println("Channel Name :"+dto.getChannelName());
            System.out.println("Video Title :"+dto.getVideoTitle());
            System.out.println("Category :"+dto.getCategory());
            System.out.println("CVideo Length :"+dto.getVideoLength());
            System.out.println("Subscription Count :"+dto.getSubscriberCount());
        }
}
