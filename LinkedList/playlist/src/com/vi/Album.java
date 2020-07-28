package com.vi;

import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Songs> songs;

    public Album(String albumName,String artist) {
        this.albumName = albumName;
        this.artist=artist;
        songs=new ArrayList<>();
    }
    public boolean addSongs(String SongName,double duration){
        if(findSong(SongName)==null){
            songs.add(new Songs(SongName,duration));
            return true;
        }else {
            return false;
        }
    }


    public String getAlbumName() {
        return albumName;
    }

    Songs findSong(String title){
        Songs sn=null;
        for (Songs songs:this.songs){
            if(songs.getTitle().equals(title)){
                sn= songs;

                break;
            }
        }
       return sn;
    }


//    public boolean addToPlaylist(LinkedList<Songs> playlist,String title){
//        if (findSong(title)!=null){
//            playlist.add(findSong(title));
//            return true;
//        }else {
//            return false;
//        }
//    }
    public void printSongs(){
        Iterator<Songs> songsIterator=songs.listIterator();
        int i=1;
        while (songsIterator.hasNext()){
            System.out.println("["+i+"]:"+songsIterator.next().toString());
            i++;
        }
        System.out.println("==============================");
    }
}
