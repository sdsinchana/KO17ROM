package com.xworkz.spotifyapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SpotifyDto {


        private String songTitle;
        private String artist;
        private String album;
        private int durationInSeconds;
        private String genre;
        private boolean isFavorite;

       /* public void setSongTitle(String songTitle) {
            this.songTitle = songTitle;
        }

        public String getSongTitle() {
            return songTitle;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getArtist() {
            return artist;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getAlbum() {
            return album;
        }

        public void setDurationInSeconds(int durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
        }

        public int getDurationInSeconds() {
            return durationInSeconds;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

        public void setIsFavorite(boolean isFavorite) {
            this.isFavorite = isFavorite;
        }

        public boolean getIsFavorite() {
            return isFavorite;
        }

        */
    }


