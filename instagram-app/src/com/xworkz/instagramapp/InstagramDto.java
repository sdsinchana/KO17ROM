package com.xworkz.instagramapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InstagramDto {


        private String userName;
        private String fullName;
        private String bio;
        private int followersCount;
        private int followingCount;
        private boolean isPrivate;

        /* public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getBio() {
            return bio;
        }

        public void setFollowersCount(int followersCount) {
            this.followersCount = followersCount;
        }

        public int getFollowersCount() {
            return followersCount;
        }

        public void setFollowingCount(int followingCount) {
            this.followingCount = followingCount;
        }

        public int getFollowingCount() {
            return followingCount;
        }

        public void setIsPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
        }

        public boolean getIsPrivate() {
            return isPrivate;
        }

         */
    }


