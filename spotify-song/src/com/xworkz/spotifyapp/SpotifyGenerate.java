package com.xworkz.spotifyapp;

public class SpotifyGenerate {


        public void addToPlaylist(SpotifyDto spotify) {
            boolean isSongValid = isSongValid(spotify);
            if (isSongValid) {
                System.out.println("Song added to playlist successfully");
            } else {
                System.out.println("Song could not be added to playlist");
            }
        }

        public boolean isSongValid(SpotifyDto spotify) {
            boolean isSongValid = false;
            boolean isTitleValid = false;
            boolean isArtistValid = false;
            boolean isAlbumValid = false;
            boolean isDurationValid = false;
            boolean isGenreValid = false;

            if (spotify.getSongTitle() != null && !spotify.getSongTitle().isEmpty())
                isTitleValid = true;
            else
                System.out.println("Invalid song title");

            if (spotify.getArtist() != null && !spotify.getArtist().isEmpty())
                isArtistValid = true;
            else
                System.out.println("Invalid artist name");

            if (spotify.getAlbum() != null && !spotify.getAlbum().isEmpty())
                isAlbumValid = true;
            else
                System.out.println("Invalid album name");

            if (spotify.getDurationInSeconds() > 0)
                isDurationValid = true;
            else
                System.out.println("Duration should be greater than zero");

            if (spotify.getGenre() != null && !spotify.getGenre().isEmpty())
                isGenreValid = true;
            else
                System.out.println("Invalid genre");

            if (isTitleValid && isArtistValid && isAlbumValid && isDurationValid && isGenreValid)
                isSongValid = true;

            return isSongValid;
        }
    }


