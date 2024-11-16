package com.example.writer;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WriterDetailsActivity extends AppCompatActivity {

    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writer_details);

        expandableListView = findViewById(R.id.expandableListView);

        // Get the writer details from the intent
        Writer writer = (Writer) getIntent().getSerializableExtra("writer");

        // Prepare data for the ExpandableListView
        List<String> headers = new ArrayList<>();
        HashMap<String, List<String>> details = new HashMap<>();

        headers.add("Birth Date");
        headers.add("Death Date");
        headers.add("Notable Works");

        List<String> birth = new ArrayList<>();
        birth.add(writer.getBirthDate());
        details.put("Birth Date", birth);

        List<String> death = new ArrayList<>();
        death.add(writer.getDeathDate());
        details.put("Death Date", death);

        List<String> works = new ArrayList<>();
        for (String work : writer.getNotableWorks()) {
            works.add(work);
        }
        details.put("Notable Works", works);

        // Set adapter
        ExpandableListAdapter expandableAdapter = new ExpandableListAdapter(this, headers, details);
        expandableListView.setAdapter(expandableAdapter);
    }
}
