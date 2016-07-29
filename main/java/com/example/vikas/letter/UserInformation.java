package com.example.vikas.letter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInformation extends AppCompatActivity {

    EditText User_name,User_address,User_phone_no,User_email_id;
    String user_name,user_address,user_phone_no,user_email_id;
    Button Save_button;
    Context ctx = this;
    Context CTX = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        User_name = (EditText) findViewById(R.id.input_name);
        User_address = (EditText) findViewById(R.id.input_address);
        User_email_id = (EditText) findViewById(R.id.input_email_id);
        User_phone_no = (EditText) findViewById(R.id.input_phone_no);
        Save_button = (Button) findViewById(R.id.save);
        Save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_name = User_name.getText().toString();
                user_address = User_address.getText().toString();
                user_phone_no = User_phone_no.getText().toString();
                user_email_id = User_email_id.getText().toString();
                UserInformationDatabase ud = new UserInformationDatabase(ctx);
                ud.putInformation(ud, user_name, user_address, user_phone_no, user_email_id);
                Toast.makeText(getApplicationContext(), "Registration success", Toast.LENGTH_LONG).show();
                startActivity(new Intent(UserInformation.this, MainPanel.class));
                finish();

                user_name = User_name.getText().toString();
                user_address = User_address.getText().toString();
                UserInformationDatabase UID = new UserInformationDatabase(CTX);
                Cursor CR = UID.getinformation(UID);
                CR.moveToFirst();
                boolean login_status = false;
                String NAME = "";
                String Address = "";
                String Phone_no = "";
                String Email_id = "";

                do {

                    NAME = CR.getString(0);
                    Address = CR.getString(1);
                    Phone_no = CR.getString(2);
                    Email_id = CR.getString(3);
                    Log.d("working", NAME);
                    Log.d("working", Address);
                    Log.d("working", Phone_no);
                    Log.d("working", Email_id);


                } while (CR.moveToNext());
            }


        });



    }

}
