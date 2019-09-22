package com.example.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Questions4 extends AppCompatActivity {
    public static CharSequence classed ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);
        Button add = (Button) findViewById(R.id.add);
        final TextView classes = (TextView) findViewById(R.id.classes);
        final Editable Stressed = ((EditText)(findViewById(R.id.Stress))).getText();
        final TextInputEditText classInput = (TextInputEditText) findViewById(R.id.classInput);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(classes.length()==0){
                    classes.setText(" ----------------- \n");
                }
                classes.setText(classes.getText()+""+((EditText)(findViewById(R.id.classInput))).getText()+"  "+((EditText)(findViewById(R.id.Stress))).getText()+"\n ----------------- \n");
                classed = classes.getText();
                classInput.getText().clear();
                Stressed.clear();
                }
        });
        Button done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GridScreen.class);
                startActivity(startIntent);
            }
        });
    }
}
