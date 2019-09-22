package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GridScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_screen);
        ImageButton food = (ImageButton) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Nutrients.class);
                startActivity(startIntent);
            }
        });
        ImageButton clock = (ImageButton) findViewById(R.id.clock);
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Monday.class);
                startActivity(startIntent);
            }
        });
        ImageButton sleepy = (ImageButton) findViewById(R.id.sleepy);
        sleepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Sleepy.class);
                startActivity(startIntent);
            }
        });
        ImageButton run = (ImageButton) findViewById(R.id.run);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Excersize.class);
                startActivity(startIntent);
            }
        });
        ImageButton meditation = (ImageButton) findViewById(R.id.meditationstuff);
        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Meditation.class);
                startActivity(startIntent);
            }
        });
        ImageButton education = (ImageButton) findViewById(R.id.education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Education.class);
                startActivity(startIntent);
            }
        });
        ImageButton profile = (ImageButton) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Profile.class);
                startActivity(startIntent);
            }
        });
    }
}
