package com.example.geekslovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Spinner mySpinner;
    Button button;
    TextView txt;
    TextView txt1;
    TextView txt2;
    ImageView image;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.txt);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        name=(EditText)findViewById(R.id.name);
        button=(Button)findViewById(R.id.button);

        mySpinner = (Spinner) findViewById(R.id.spinner1);
        image=(ImageView)findViewById(R.id.image1);

        String [] names ={"Select One","Java","Python", "HTML", "CSS", "NodeJs", "JavaScript"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,names);

        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 1:
                        image.setImageResource(R.drawable.java);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.python);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.html);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.css);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.nodejs);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.js);
                        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                        break;

                }
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    public void Calculate(View view){

        Random random = new Random();

        int val = random.nextInt(100);
        txt.setText(Integer.toString(val));

        String name1= name.getText().toString();
        txt2.setText(name1);

        txt1.setText(Integer.toString(val));
    }


}