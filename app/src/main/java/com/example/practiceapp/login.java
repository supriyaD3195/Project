package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    public ImageView signup,go;
    public TextView textLogin, text1;
    public EditText email,password;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        signup = (ImageView) findViewById(R.id.singupbtn);
        go = (ImageView) findViewById(R.id.imggo);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(), password.getText().toString());
            }
        });
signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i =new Intent(login.this,signup.class);
        startActivity(i);
    }
});


    }
    private void validate(String email, String password){
        if((email.equals("Admin@gmail.com")) && (password.equals("admin")))
            {
                     Toast.makeText(getApplicationContext(),"Login successfully",Toast.LENGTH_SHORT).show();}
               else
                {
                      Toast.makeText(getApplicationContext(),"Check email and password",Toast.LENGTH_SHORT).show();
                  }




    }
}
