package com.example.writer;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Writer> {

    public CustomListAdapter(Context context, ArrayList<Writer> writers) {
        super(context, 0, writers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Writer writer = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_writer, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.writerName);
        nameTextView.setText(writer.getName());

        return convertView;
    }
}
