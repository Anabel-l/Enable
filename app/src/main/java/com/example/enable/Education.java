package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        TextView classity = (TextView) findViewById(R.id.classity);
        if(Questions4.classed.length()==0) {
            classity.setText("you have no classes");
        } else {
                classity.setText(Questions4.classed);
        }
        ImageButton backspace = (ImageButton) findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GridScreen.class);
                startActivity(startIntent);
            }
        });
    }
}
