package com.example.bartoszjaniak.meetchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Piotrek on 2017-06-02.
 */

public class MyAdapter extends ArrayAdapter<EventInfo> {
    private final Context context;
    private final List<EventInfo> values;

    public MyAdapter(Context context, List<EventInfo>values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.autor);
        TextView textView2 = (TextView) rowView.findViewById(R.id.autor);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.opis);
        textView.setText(values.get(position).user);
        textView2.setText(values.get(position).description);
        // change the icon for Windows and iPhone
        //imageView.setImageResource(R.drawable.ok);
        return rowView;
    }
}
