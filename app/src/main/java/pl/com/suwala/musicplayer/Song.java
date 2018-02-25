package pl.com.suwala.musicplayer;

import android.support.annotation.NonNull;

/**
 * Created by dsuwa on 21.02.2018.
 */

public class Song implements Comparable<Song>{
    private String title;
    private String author;
    private String album;
    private int albumCover;
    private boolean imageStatus;

    Song(String title, String author, String album, int albumCover) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.albumCover = albumCover;

    }

    Song(String title, String author, String album) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.albumCover = R.drawable.empty_cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    int getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }

    @Override
    public int compareTo(@NonNull Song o) {

           return title.compareTo(o.title);

    }
}


