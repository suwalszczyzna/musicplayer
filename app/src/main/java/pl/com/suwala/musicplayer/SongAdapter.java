package pl.com.suwala.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dsuwa on 2/22/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentSong = getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.song_title);
        titleTextView.setText(currentSong.getTitle());
        TextView defaultTextView = listItemView.findViewById(R.id.song_author);
        defaultTextView.setText(currentSong.getAuthor());
        ImageView imageView = listItemView.findViewById(R.id.album_cover);
        imageView.setImageResource(currentSong.getAlbumCover());


        return listItemView;
    }
}
