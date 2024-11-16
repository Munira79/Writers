package com.example.writer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView writersListView;
    ArrayList<Writer> writers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writersListView = findViewById(R.id.writersListView);

        // List of writers
        writers = new ArrayList<>();
        writers.add(new Writer("Humayun Ahmed", "13 November 1948", "19 July 2012",
                new String[]{"Himu Series", "Misir Ali Series", "Shonkhonil Karagar"}));
        writers.add(new Writer("Kazi Nazrul Islam", "24 May 1899", "29 August 1976",
                new String[]{"Bidrohi", "Agnibina", "Dolonchapa"}));
        writers.add(new Writer("Rabindranath Tagore", "7 May 1861", "7 August 1941",
                new String[]{"Gitanjali", "Kabuliwala", "Chokher Bali"}));
        writers.add(new Writer("Shomoresh Mojumder", "10 March 1942", "8 May 2023",
                new String[]{"Kalbela", "Kobi", "Uttaradhikar"}));
        writers.add(new Writer("Satyajit Ray", "2 May 1921", "23 April 1992",
                new String[]{"Feluda Series", "Apu Trilogy", "Goopy Gyne Bagha Byne"}));

        // Setting up the adapter for the ListView
        CustomListAdapter adapter = new CustomListAdapter(this, writers);
        writersListView.setAdapter(adapter);

        // Click listener for list items
        writersListView.setOnItemClickListener((AdapterView<?> parent, android.view.View view, int position, long id) -> {
            Intent intent = new Intent(MainActivity.this, WriterDetailsActivity.class);
            intent.putExtra("writer", writers.get(position));
            startActivity(intent);
        });
    }
}
