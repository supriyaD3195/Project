package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
public EditText  name, email, password;
public ImageView  go, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();
        name =(EditText)findViewById(R.id.editTextTexname);
        email =(EditText)findViewById(R.id.editTextTextEmailAddress);
        password =(EditText)findViewById(R.id.editTextTextPassword);
go=(ImageView)findViewById(R.id.imggo) ;
login=(ImageView)findViewById(R.id.singupbtn) ;
go.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"Save information",Toast.LENGTH_SHORT).show();
    }
});
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(signup.this, login.class);
                startActivity(i);
            }
        });
    }
}