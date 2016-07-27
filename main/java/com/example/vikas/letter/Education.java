package com.example.vikas.letter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Education extends AppCompatActivity {


    RecyclerView EducationrecyclerView;
    RecyclerView.LayoutManager EducationlayoutManager;
    RecyclerView.Adapter Educationadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        EducationrecyclerView = (RecyclerView) findViewById(R.id.education_recycler_view);
        EducationlayoutManager = new LinearLayoutManager(this);
        EducationrecyclerView.setLayoutManager(EducationlayoutManager);
        Educationadapter = new EducationRecyclerAdapter(this);
        EducationrecyclerView.setAdapter(Educationadapter);
    }

}
