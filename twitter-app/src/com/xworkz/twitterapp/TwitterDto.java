package com.xworkz.twitterapp;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TwitterDto {

        private String userName;
        private String tweetContent;
        private int tweetLength;
        private String location;
        private boolean isVerified;
        private int followersCount;

       /* public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setTweetContent(String tweetContent) {
            this.tweetContent = tweetContent;
        }

        public String getTweetContent() {
            return tweetContent;
        }

        public void setTweetLength(int tweetLength) {
            this.tweetLength = tweetLength;
        }

        public int getTweetLength() {
            return tweetLength;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        public void setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
        }

        public boolean getIsVerified() {
            return isVerified;
        }

        public void setFollowersCount(int followersCount) {
            this.followersCount = followersCount;
        }

        public int getFollowersCount() {
            return followersCount;
        }


        */


}
