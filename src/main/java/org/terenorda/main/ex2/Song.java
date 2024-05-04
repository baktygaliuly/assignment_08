package org.terenorda.main.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the Song class
class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}


interface Playlist {
    Iterator<Song> createIterator();

    void addSong(Song song);
}


class PlaylistImpl implements Playlist {
    private List<Song> songs;

    public PlaylistImpl() {
        songs = new ArrayList<>();
    }

    @Override
    public Iterator<Song> createIterator() {
        return songs.iterator();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }
}




