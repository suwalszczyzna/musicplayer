package pl.com.suwala.musicplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by dsuwa on 2/22/2018.
 */

public class SongsListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album", R.drawable.cover));
        songs.add(new Song("Some Day", "U25", "Some album"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
