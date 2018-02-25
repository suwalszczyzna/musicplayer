package pl.com.suwala.musicplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;


public class SongListFragment extends Fragment {


    public SongListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);
        //Create songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Prelude Op. 28, No. 15 in D-flat major", "Frédéric Chopin", "Some album", R.drawable.chopin));
        songs.add(new Song("Foggy day", "Ella Fitzgerald", "Ella and Louis", R.drawable.ella));
        songs.add(new Song("Cry Me a River", "Michaela Bublé", "Crazy Love"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Prelude Op. 28, No. 15 in D-flat major", "Frédéric Chopin", "Some album", R.drawable.chopin));
        songs.add(new Song("Foggy day", "Ella Fitzgerald", "Ella and Louis", R.drawable.ella));
        songs.add(new Song("Cry Me a River", "Michaela Bublé", "Crazy Love"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Prelude Op. 28, No. 15 in D-flat major", "Frédéric Chopin", "Some album", R.drawable.chopin));
        songs.add(new Song("Foggy day", "Ella Fitzgerald", "Ella and Louis", R.drawable.ella));
        songs.add(new Song("Cry Me a River", "Michaela Bublé", "Crazy Love"));
        songs.add(new Song("Beautiful Day", "U2", "Some album", R.drawable.cover));
        songs.add(new Song("Prelude Op. 28, No. 15 in D-flat major", "Frédéric Chopin", "Some album", R.drawable.chopin));
        songs.add(new Song("Foggy day", "Ella Fitzgerald", "Ella and Louis", R.drawable.ella));
        songs.add(new Song("Cry Me a River", "Michaela Bublé", "Crazy Love"));
        Collections.sort(songs);

        SongAdapter adapter = new SongAdapter(getActivity(), songs);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = songs.get(position);
                Intent i = new Intent(getContext(), MainPlayerActivity.class);
                i.putExtra("songTitle", song.getTitle());
                i.putExtra("songArtist", song.getAuthor());
                i.putExtra("songAlbum", song.getAlbum());
                i.putExtra("songCover", song.getAlbumCover());
                startActivity(i);
            }
        });

        return rootView;
    }

}
