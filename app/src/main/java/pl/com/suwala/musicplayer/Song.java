package pl.com.suwala.musicplayer;

/**
 * Created by dsuwa on 21.02.2018.
 */

public class Song{
    private String title;
    private String author;
    private String album;
    private int albumCover;

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

    public String getAlbum() {
        return album;
    }

    int getAlbumCover() {
        return albumCover;
    }


}


