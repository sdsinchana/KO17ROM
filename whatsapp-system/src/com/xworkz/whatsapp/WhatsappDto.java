package com.xworkz.whatsapp;

public class WhatsappDto {

        private String userName;
        private String statusMessage;
        private String phoneNumber;
        private boolean isOnline;
        private boolean isTyping;
        private int unreadMessagesCount;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
        }

        public String getStatusMessage() {
            return statusMessage;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setIsOnline(boolean isOnline) {
            this.isOnline = isOnline;
        }

        public boolean isOnline() {
            return isOnline;
        }

        public void setIsTyping(boolean isTyping) {
            this.isTyping = isTyping;
        }

        public boolean isTyping() {
            return isTyping;
        }

        public void setUnreadMessagesCount(int unreadMessagesCount) {
            this.unreadMessagesCount = unreadMessagesCount;
        }

        public int getUnreadMessagesCount() {
            return unreadMessagesCount;
        }


}
