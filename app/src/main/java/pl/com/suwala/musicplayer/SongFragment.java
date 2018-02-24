package pl.com.suwala.musicplayer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongFragment extends Fragment {


    public SongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);
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

        SongAdapter adapter = new SongAdapter(getActivity(), songs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
