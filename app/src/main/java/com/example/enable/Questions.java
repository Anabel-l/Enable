package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questions extends AppCompatActivity {
    public static int age = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        Button young = (Button) findViewById(R.id.young);
        young.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = 0;
                Intent startIntent = new Intent(getApplicationContext(), Questions2.class);
                startActivity(startIntent);
            }
        });
        Button high = (Button) findViewById(R.id.high2);
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = 1;
                Intent startIntent = new Intent(getApplicationContext(), Questions2.class);
                startActivity(startIntent);
            }
        });
        Button college = (Button) findViewById(R.id.college);
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = 2;
                Intent startIntent = new Intent(getApplicationContext(), Questions2.class);
                startActivity(startIntent);
            }
        });
    }
}
