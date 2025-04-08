package com.xworkz.youtubeapp;

public class YouTubeRunner {
    
        public static void main(String[] args) {
            YouTubeDto dto = new YouTubeDto();

            dto.setChannelName("Sinchana Tech");
            dto.setVideoTitle("Spring Boot Crash Course");
            dto.setCategory("Education");
            dto.setVideoLength(1200); 
            dto.setLive(true);
            dto.setSubscriberCount(4500);

            YouTubeApp app = new YouTubeApp();
            app.playVideo(dto);
        }
    }


