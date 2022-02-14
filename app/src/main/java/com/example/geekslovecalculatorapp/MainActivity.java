package com.example.geekslovecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    EditText full_name;
    int start=0;
    String[] languages = { "C", "Java","Python", "HTML","MYSQL", "C#" };
    ImageView image;
    final Random myrandom=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        full_name=(EditText)findViewById(R.id.full_name);
        //
        Spinner spino = findViewById(R.id.dropdownlist);
        spino.setOnItemSelectedListener(this);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_spinner_item,languages);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spino.setAdapter(ad);


    }
    public void name(View v){
        String s="";
        full_name.setText(s);
    }
    public void calculate(View v){

        //if the name is empty ->error

        String fullname =full_name.getText().toString();
        if(fullname.equals("") || fullname.equals("Enter Full Name")){
            Toast.makeText(getApplicationContext(), "Please enter a valid name", Toast.LENGTH_SHORT).show();
        }else{
            ImageView image=(ImageView)findViewById(R.id.image1);
            Spinner mySpinner = (Spinner) findViewById(R.id.dropdownlist);
            String text = mySpinner.getSelectedItem().toString();
            if(text=="C"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.c);
            }
            if(text=="Java"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.java);
            }
            if(text=="Python"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.python);
            }
            if(text=="HTML"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.html);
            }
            if(text=="MYSQL"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.mysql);
            }
            if(text=="C#"){
                image.animate().alpha(1);
                image.setImageResource(R.drawable.csharp);
            }

            TextView percentage=(TextView)findViewById(R.id.percentage);
            String s=String.valueOf(myrandom.nextInt(100))+"";
            percentage.setText(s);
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}