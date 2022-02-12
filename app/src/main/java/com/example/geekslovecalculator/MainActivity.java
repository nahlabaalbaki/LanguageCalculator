package com.example.geekslovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Spinner mySpinner;
    Button button;
    TextView txt;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txt=(TextView)findViewById(R.id.txt);
        button=(Button)findViewById(R.id.button);

        mySpinner = (Spinner) findViewById(R.id.spinner1);
        image=(ImageView)findViewById(R.id.image);

        String [] names ={"Select One","Java","Python", "HTML", "CSS", "NodeJs", "JavaScript"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,names);

        mySpinner.setAdapter(myAdapter);



    }
    public void Calculate(View view){

        Random random = new Random();

        int val = random.nextInt(100);
        txt.setText(Integer.toString(val));


    }

}