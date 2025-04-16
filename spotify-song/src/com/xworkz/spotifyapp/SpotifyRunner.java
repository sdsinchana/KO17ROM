package com.xworkz.spotifyapp;

public class SpotifyRunner {

        public static void main(String[] args) {
            SpotifyDto spotify = new SpotifyDto();
            spotify.setSongTitle("Perfect");
            spotify.setArtist("Ed Sheeran");
            spotify.setAlbum("Divide");
            spotify.setDurationInSeconds(263);
            spotify.setGenre("Pop");
            spotify.isFavorite();

            SpotifyGenerate spotifyApp = new SpotifyGenerate();
            spotifyApp.addToPlaylist(spotify);
            spotifyApp.fetchDetails();
        }
    }


