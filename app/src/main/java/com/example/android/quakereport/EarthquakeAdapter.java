package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by daniel on 03-Oct-17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false
            );
        }

        Earthquake earthquake = getItem(position);

        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        magnitude.setText(String.valueOf(earthquake.getMagnitude()));

        TextView city = listItemView.findViewById(R.id.city);
        city.setText(earthquake.getCity());

        TextView date = listItemView.findViewById(R.id.date);
        date.setText(earthquake.getDate());

        return listItemView;
    }
}
