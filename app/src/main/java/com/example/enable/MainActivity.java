package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static EditText username;
    public static EditText password;
    public static EditText name;
    public static EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.mail);

        Button loginNext = (Button) findViewById(R.id.loginNext);

        loginNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Questions.class);
                startActivity(startIntent);
            }
        });
    }
}


