package com.example.vikas.letter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Corporate extends AppCompatActivity {

    RecyclerView CorporaterecyclerView;
    RecyclerView.LayoutManager CorporatelayoutManager;
    RecyclerView.Adapter Corporateadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CorporaterecyclerView = (RecyclerView) findViewById(R.id.corporate_recycler_view);
        CorporatelayoutManager = new LinearLayoutManager(this);
        CorporaterecyclerView.setLayoutManager(CorporatelayoutManager);
        Corporateadapter = new CorporateRecyclerAdapter(this);
        CorporaterecyclerView.setAdapter(Corporateadapter);
    }

}
