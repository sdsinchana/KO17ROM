package com.xworkz.yohooapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class YohooDto {


        private String displayName;
        private String moodMessage;
        private String contactNumber;
        private boolean activeNow;
        private boolean composingMessage;
        private int pendingNotifications;

       /* public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setMoodMessage(String moodMessage) {
            this.moodMessage = moodMessage;
        }

        public String getMoodMessage() {
            return moodMessage;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setActiveNow(boolean activeNow) {
            this.activeNow = activeNow;
        }

        public boolean isActiveNow() {
            return activeNow;
        }

        public void setComposingMessage(boolean composingMessage) {
            this.composingMessage = composingMessage;
        }

        public boolean isComposingMessage() {
            return composingMessage;
        }

        public void setPendingNotifications(int pendingNotifications) {
            this.pendingNotifications = pendingNotifications;
        }

        public int getPendingNotifications() {
            return pendingNotifications;
        }

        */
}

