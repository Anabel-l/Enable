package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Meditation extends AppCompatActivity {
    public static int stop =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        ImageButton play1 = (ImageButton) findViewById(R.id.play1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ring= MediaPlayer.create(Meditation.this,R.raw.med1);
                if(stop==0) {
                    ring.start();
                } else{
                    ring.stop();
                    stop = 0;
                }
                stop++;
            }
        });
        ImageButton play2 = (ImageButton) findViewById(R.id.play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ring= MediaPlayer.create(Meditation.this,R.raw.med2);
                if(stop==0) {
                    ring.start();
                } else{
                    ring.stop();
                    stop = 0;
                }
                stop++;
            }
        });
        ImageButton play3 = (ImageButton) findViewById(R.id.play3);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ring= MediaPlayer.create(Meditation.this,R.raw.med3);

                if(stop==0) {
                    ring.start();
                } else{
                    ring.stop();
                    stop = 0;
                }
                stop++;
            }        });
        ImageButton play4 = (ImageButton) findViewById(R.id.play4);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ring= MediaPlayer.create(Meditation.this,R.raw.med4);
                if(stop==0) {
                    ring.start();
                } else{
                    ring.stop();
                    stop = 0;
                }
                stop++;
            }
        });
        ImageButton revert = (ImageButton) findViewById(R.id.revert);
        revert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GridScreen.class);
                startActivity(startIntent);
            }
        });
    }
}
