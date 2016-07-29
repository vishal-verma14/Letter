package com.example.vikas.letter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vikas on 28/7/16.
 */
public class Job_Application  extends AppCompatActivity {
    EditText et_authority,et_address,et_date,et_request,et_amount,et_account_no,et_content,et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        et_authority = (EditText) findViewById(R.id.et_authority);
        et_date = (EditText) findViewById(R.id.et_date);
        et_address = (EditText) findViewById(R.id.et_address);
        et_request = (EditText) findViewById(R.id.et_request);
        et_amount = (EditText) findViewById(R.id.et_amount);
        et_account_no  = (EditText) findViewById(R.id.et_account_no);
        et_content   = (EditText) findViewById(R.id.et_content);
        et_name   = (EditText) findViewById(R.id.et_name);
        et_authority.setText("To Manager");

        String today_date = new SimpleDateFormat("dd-MM-yy").format(new Date());
        et_date.setText("Date: " + today_date);


    }

}
