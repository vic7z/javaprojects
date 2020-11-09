package com.vi;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PlayList extends Album {
    private String playlistName;
    private List<Songs> playlist;

    public PlayList(String playlistName) {
        super(null, null);
        this.playlistName = playlistName;
        playlist = new LinkedList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public boolean addToPlaylist(String title) {
        if (findSong(title) != null) {
            playlist.add(findSong(title));
            return true;
        } else {
            return false;
        }
    }

    public void printSongs() {
        Iterator<Songs> songsIterator = playlist.listIterator();
        int i = 1;
        FileWriter writer = null;
        while (songsIterator.hasNext()) {
            try {
                writer = new FileWriter("playlist.txt");
                System.out.println("[" + i + "]:" + songsIterator.next().toString());
                writer.write("[" + i + "]:" + songsIterator.next().toString());
                i++;

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<Songs> getPlaylist() {
        return (LinkedList<Songs>) Collections.unmodifiableList(playlist);
    }
}
