package pl.com.suwala.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dsuwa on 2/22/2018.
 */

public class SongsListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlist_activity);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SongFragment())
                .commit();
    }
}
