package pl.com.suwala.musicplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dsuwa on 24.02.2018.
 */

public class MainPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_player);

        String title;
        String author;
        String album;
        int coverID;

        TextView tv_songTitle = findViewById(R.id.tv_songTitle);
        TextView tv_artistName = findViewById(R.id.tv_artistName);
        TextView tv_albumTitle = findViewById(R.id.tv_albumTitle);

        ImageView cover = findViewById(R.id.cover_image);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                title = "?";
                author = "?";
                album = "?";
                coverID = R.drawable.empty_cover;
            } else {
                title = extras.getString("songTitle");
                author = extras.getString("songArtist");
                album = extras.getString("songAlbum");
                coverID = extras.getInt("songCover");
            }
        } else {
            title = (String) savedInstanceState.getSerializable("songTitle");
            author = (String) savedInstanceState.getSerializable("songArtist");
            album = (String) savedInstanceState.getSerializable("songAlbum");
            coverID = (int) savedInstanceState.getSerializable("songCover");
        }

        tv_songTitle.setText(title);
        tv_artistName.setText(author);
        tv_albumTitle.setText(album);

        cover.setImageResource(coverID);
    }
}
