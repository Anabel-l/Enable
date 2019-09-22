package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Nutrients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String cal, protein, carb, fat, water;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrients);
        if(Questions.age==0){
            cal="1,600 - 2,200";
            protein = "10%";
            carb = "50% - 60%";
            fat = "20% - 25%";
            water="1 - 2 liters (5 - 10 glasses)";
        } else if(Questions.age==1){
            cal="2,200 - 2,800";
            protein = "10%";
            carb = "45% - 65%";
            fat = "30%";
            water = "2 liters (8 - 10 glasses)";
        } else{
            cal="1,800 - 2,400";
            protein = "20% - 25%";
            carb = "45% - 65%";
            fat = "30% - 35%";
            water = "2 - 3 liters (10 - 20 glasses)";
        }
        ((TextView) findViewById(R.id.calorieNum)).setText(cal);
        ((TextView) findViewById(R.id.proteinNum)).setText(protein);
        ((TextView) findViewById(R.id.carbNum)).setText(carb);
        ((TextView) findViewById(R.id.fatNum)).setText(fat);
        ((TextView) findViewById(R.id.waterNum)).setText(water);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GridScreen.class);
                startActivity(startIntent);
            }
        });

    }
}
