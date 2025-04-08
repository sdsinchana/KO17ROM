package com.xworkz.youtubeapp;

public class YouTubeDto {


        private String channelName;
        private String videoTitle;
        private String category; // e.g., Education, Entertainment, Music
        private int videoLength; // in seconds
        private boolean isLive;
        private int subscriberCount;

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setVideoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
        }

        public String getVideoTitle() {
            return videoTitle;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setVideoLength(int videoLength) {
            this.videoLength = videoLength;
        }

        public int getVideoLength() {
            return videoLength;
        }

        public void setLive(boolean isLive) {
            this.isLive = isLive;
        }

        public boolean isLive() {
            return isLive;
        }

        public void setSubscriberCount(int subscriberCount) {
            this.subscriberCount = subscriberCount;
        }

        public int getSubscriberCount() {
            return subscriberCount;
        }


}
