package com.example.vikas.letter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class BANK extends AppCompatActivity {

    RecyclerView BankrecyclerView;
    RecyclerView.LayoutManager BanklayoutManager;
    RecyclerView.Adapter Bankadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        BankrecyclerView = (RecyclerView) findViewById(R.id.bank_recycler_view);
        BanklayoutManager = new LinearLayoutManager(this);
        BankrecyclerView.setLayoutManager(BanklayoutManager);
    Bankadapter = new BankRecyclerAdapter(this);
        BankrecyclerView.setAdapter(Bankadapter);
    }

}
