package com.vi;

import java.util.*;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Album> albums;
    private static LinkedList<PlayList> playLists;

    public static void main(String[] args) {
        albums = new ArrayList<>();
        playLists = new LinkedList<>();
        printMainMenu();
    }


    public static void printMainMenu() {
        printMenu();
        System.out.println("=======================");
        boolean flag = false;
        while (!false) {
            System.out.println("enter an option");
            int option = in.nextInt();
            boolean quit = false;
            in.nextLine();
            option -= 1;

            switch (option) {
                case 0:
                    System.out.println("enter the album name");
                    String name = in.nextLine();
                    System.out.println("enter the artist name");
                    String artist = in.nextLine();
                    albums.add(new Album(name, artist));
                    break;
                case 1:
                    addSongs();
                    break;
                case 2:
                    printAlbums();
                    break;
                case 3:
                    createPlaylist();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        }
    }


    public static void printPlaylist(LinkedList<Songs> songs) {
        ListIterator<Songs> songsListIterator = songs.listIterator();
        while (songsListIterator.hasNext()) {
            System.out.println(songsListIterator.next().toString());

        }
    }

    private static void printMenu() {
        System.out.println("1.add albums\n" +
                "2.add Songs\n" +
                "3.Print Added Songs\n" +
                "4.Create A  playlist");
    }


    private static void addSongs() {
        System.out.println("=========================");
        System.out.println("1.Add songs to album\n2.Add songs to playlist");
        int option = in.nextByte();
        --option;
        boolean flag = false;
        while (!flag) {
            switch (option) {
                case 0:
                    addSongsToAlbum();
                    break;
                case 1:
                    addSongsToPlaylist();
                    break;
                case 2:
                    System.out.println("[Q] to go back to main menu");
                    String fg = in.next();
                    if (fg.toLowerCase().equals("q")) {
                        flag = true;

                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
        printMainMenu();

    }


    private static void addSongsToAlbum() {
        System.out.println("====Select an album to add songs to====");
        Iterator<Album> albumIterator = albums.listIterator();
        if (albums.isEmpty()) {
            System.out.println("Please add an album first");
            return;
        } else {
            int i = 1;
            while (albumIterator.hasNext()) {
                System.out.println("[" + i + "] :" + albumIterator.next().getAlbumName());
                i++;
            }
            System.out.println("============================");
            int option = in.nextInt();
            in.nextLine();
            boolean flag = false;
            System.out.println("[Q] to exit");
            while (!flag) {
                System.out.println("enter the song name");
                String name = in.next();
                System.out.println("enter song duration");
                double duration = in.nextDouble();
                albums.get(option - 1).addSongs(name, duration);
                System.out.println("[Q] to quit");
                String f = in.next();
                in.nextLine();
                if (f.toLowerCase().equals("q")) {
                    flag = !flag;

                }
            }
            printMainMenu();
        }
    }


    private static void addSongsToPlaylist() {
        if (playLists.isEmpty()) {
            System.out.println("Please create a playList  first");
            printMainMenu();
            return;
        } else {
            System.out.println("====Select a playlist to add songs to====");
            Iterator<PlayList> playListIterator = playLists.listIterator();
            int i = 1;
            while (playListIterator.hasNext()) {
                System.out.println("[" + i + "] :" + playListIterator.next().getPlaylistName());
                i++;
            }
            System.out.println("===============================");
            int option = in.nextInt();
            option -= option;
            in.nextLine();
            boolean flag = false;
            System.out.println("[Q] to exit");
            while (!flag) {
                System.out.println("enter the song name");
                String name = in.next();
                if (playLists.get(option).addToPlaylist(name)) {
                    System.out.println("the song " + name + "is added successfully to " + playLists.get(option).getPlaylistName());
                } else {
                    System.out.println("Something went wrong ");
                }
                System.out.println("[Q] to quit");
                String f = in.next();
                if (f.toLowerCase().equals("q")) {
                    flag = !flag;

                }
            }
            printMainMenu();

        }
    }


    private static void printAlbums() {
        Iterator<Album> albumIterator = albums.listIterator();
        int i = 1;
        while (albumIterator.hasNext()) {
            Album album = albumIterator.next();
            System.out.println("[" + i + "] :" + album.getAlbumName());
            System.out.println("========songs========");
            album.printSongs();
            i++;
        }
    }


    private static void createPlaylist() {
        System.out.println("Enter the playlist Name");
        String playlist = in.next();
        playLists.add(new PlayList(playlist));


    }

//    private static void exportPlaylist() {
//        boolean flag=false;
//        List<Songs> songs=null;
//        System.out.println("enter the playlist name");
//        String playlist=null;
//        try {
//            playlist=in.next();
//        }catch (Exception e){
//            return;
//        }
//        for (PlayList pl:playLists){
//            if(playlist==pl.getPlaylistName()){
//                flag=true;
//                songs=new LinkedList<>(pl.getPlaylist());
//                break;
//            }
//        }
//        if (flag){
//            try {
//                FileWriter writer = new FileWriter("playlist.txt");
//                writer.write(playlist + "\n");
//                for (Songs s : songs) {
//                    writer.write(s.toString() + "\n");
//                }
//
//            } catch (IOException e) {
//                return;
//            }
//        }
//    }

}
