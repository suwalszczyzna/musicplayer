package pl.com.suwala.musicplayer;

/**
 * Created by dsuwa on 21.02.2018.
 */

public class Song {
    private String title;
    private String author;
    private String album;
    private int albumCover;

    public Song(String title, String author, String album, int albumCover) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.albumCover = albumCover;
    }

    public Song(String title, String author, String album) {
        this.title = title;
        this.author = author;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
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

    public int getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }
}


