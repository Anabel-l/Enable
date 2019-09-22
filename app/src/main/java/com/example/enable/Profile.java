package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ((TextView) findViewById(R.id.elnombrereal)).setText(MainActivity.name.getText());
        ((TextView) findViewById(R.id.userario)).setText(MainActivity.username.getText());
        String school="";
        if(Questions3.school ==0){
            school = "Middle School Student";
        } else if(Questions3.school ==1){
            school = "High School Student";
        }else {
            school = "College Student";
        }
        ((TextView) findViewById(R.id.escuela)).setText(school);
        if(Questions.age ==0){
            ((TextView) findViewById(R.id.agerange)).setText("6-13 years old");
        } else if(Questions.age ==1){
            ((TextView) findViewById(R.id.agerange)).setText("14-17 years old");
        }else {
            ((TextView) findViewById(R.id.agerange)).setText("18+ years old");
        }
        ((TextView) findViewById(R.id.email)).setText(MainActivity.email.getText());
        ((TextView) findViewById(R.id.password)).setText(MainActivity.password.getText());
    }
}
