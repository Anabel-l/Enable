package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);
        TextView sleepHours = (TextView) findViewById(R.id.sleepHours);
        if(Questions.age==0){
            sleepHours.setText("9-11");
        } else if(Questions.age==1){
            sleepHours.setText("8-10");
        } else{
            sleepHours.setText("7-9");
        }
        Button sleepNext = (Button) findViewById(R.id.sleepNext);
        sleepNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Questions3.class);
                startActivity(startIntent);
            }
        });
    }
}
