package com.xworkz.youtubeapp;

public class YouTubeApp {
        public void playVideo(YouTubeDto dto) {
            boolean isValid = isVideoValid(dto);
            if (isValid) {
                System.out.println("Now playing: " + dto.getVideoTitle() + " on channel " + dto.getChannelName());

                System.out.println("Category: " + dto.getCategory());
                System.out.println("Duration: " + dto.getVideoLength() + " seconds");

                if (dto.isLive()) {
                    System.out.println(" This video is LIVE now!");
                } else {
                    System.out.println(" This is a recorded video.");
                }

                System.out.println("Subscribers: " + dto.getSubscriberCount());
            } else {
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


}
