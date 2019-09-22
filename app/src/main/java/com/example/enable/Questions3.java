package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questions3 extends AppCompatActivity {
    public static int school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions3);
        Button middle = (Button) findViewById(R.id.middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                school = 0;
                Intent startIntent = new Intent(getApplicationContext(), Questions4.class);
                startActivity(startIntent);
            }
        });
        Button high2 = (Button) findViewById(R.id.high2);
        high2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                school = 1;
                Intent startIntent = new Intent(getApplicationContext(), Questions4.class);
                startActivity(startIntent);
            }
        });
        Button college = (Button) findViewById(R.id.college);
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                school = 2;//
                Intent startIntent = new Intent(getApplicationContext(), Questions4.class);
                startActivity(startIntent);
            }
        });
    }
}
