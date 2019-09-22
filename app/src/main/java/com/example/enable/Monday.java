package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Monday extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        myDialog = new Dialog(this);
        ImageButton back = (ImageButton) findViewById(R.id.baback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GridScreen.class);
                startActivity(startIntent);
            }
        });
    }

    public void ShowPopup(View v){
        myDialog.setContentView(R.layout.popup_monday);
        ImageButton close = (ImageButton)myDialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void ShowPopup2(View v){
        myDialog.setContentView(R.layout.popup_meditation);
        ImageButton close2 = (ImageButton)myDialog.findViewById(R.id.close2);
        close2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
    public void ShowPopup3(View v){
        myDialog.setContentView(R.layout.popup_running);
        ImageButton close3 = (ImageButton)myDialog.findViewById(R.id.close3);
        close3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
    public void ShowPopup4(View v){
        myDialog.setContentView(R.layout.popup_dinner);
        ImageButton close4 = (ImageButton)myDialog.findViewById(R.id.close4);
        Button nutrients = (Button)myDialog.findViewById(R.id.nutrients);
        nutrients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Nutrients.class);
                startActivity(startIntent);
            }
        });
        close4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
    public void ShowPopup5(View v){
        myDialog.setContentView(R.layout.popup_sleep);
        ImageButton close5 = (ImageButton)myDialog.findViewById(R.id.close5);
        close5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

}
