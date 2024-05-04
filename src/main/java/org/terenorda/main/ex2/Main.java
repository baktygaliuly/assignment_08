package org.terenorda.main.ex2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();
        playlist.addSong(new Song("Song 1", "Artist 1"));
        playlist.addSong(new Song("Song 2", "Artist 2"));
        playlist.addSong(new Song("Song 3", "Artist 3"));

        Iterator<Song> iterator = playlist.createIterator();

        System.out.println("Songs in the playlist:");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
