package com.vi;

import java.util.Iterator;
import java.util.LinkedList;

public class PlayList extends Album{
    private String playlistName;
    private LinkedList<Songs> playlist;

    public PlayList(String playlistName) {
        super(null,null);
        this.playlistName = playlistName;
        playlist =new LinkedList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public boolean addToPlaylist(String title){
        if (findSong(title)!=null){
            playlist.add(findSong(title));
            return true;
        }else {
            return false;
        }
    }
    public void printSongs(){
        Iterator<Songs> songsIterator=playlist.listIterator();
        int i=1;
        while (songsIterator.hasNext()){
            System.out.println("["+i+"]:"+songsIterator.next().toString());
            i++;
        }
    }

}
