package pl.com.suwala.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_player);

        Intent songsIntent = new Intent(MainActivity.this, SongsListActivity.class);

        // Start the new activity
        startActivity(songsIntent);
    }
}
