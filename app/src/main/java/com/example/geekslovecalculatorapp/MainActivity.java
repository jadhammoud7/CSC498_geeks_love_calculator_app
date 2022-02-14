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

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView name_row1;
    TextView percentage_row1;
    TextView name_row2;
    TextView percentage_row2;
    TextView name_row3;
    TextView percentage_row3;
    TextView name_row4;
    TextView percentage_row4;

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

        image=(ImageView)findViewById(R.id.image1);
        image.setX(-1500);


        name_row1= (TextView) findViewById(R.id.name_row1);
        percentage_row1=(TextView)findViewById(R.id.percentage_row1);
        name_row2= (TextView) findViewById(R.id.name_row2);
        percentage_row2=(TextView)findViewById(R.id.percentage_row2);
        name_row3= (TextView) findViewById(R.id.name_row3);
        percentage_row3=(TextView)findViewById(R.id.percentage_row3);
        name_row4= (TextView) findViewById(R.id.name_row4);
        percentage_row4=(TextView)findViewById(R.id.percentage_row4);

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
            image.setX(-1500);
            Spinner mySpinner = (Spinner) findViewById(R.id.dropdownlist);
            String text = mySpinner.getSelectedItem().toString();
            if(text=="C"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.c);
            }
            if(text=="Java"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.java);
            }
            if(text=="Python"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.python);
            }
            if(text=="HTML"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.html);
            }
            if(text=="MYSQL"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.mysql);
            }
            if(text=="C#"){
                image.animate().alpha(1);
                image.animate().translationXBy(2100);
                image.setImageResource(R.drawable.csharp);
            }

            TextView percentage=(TextView)findViewById(R.id.percentage);
            String s=String.valueOf(myrandom.nextInt(100))+"";
            percentage.setText(s);

            //puttin them in a table
            if( name_row1.getText().toString().equals("") &&  percentage_row1.getText().toString().equals("")){
                name_row1.setText(fullname);
                percentage_row1.setText(s);
            }else if( name_row2.getText().toString().equals("") &&  percentage_row2.getText().toString().equals("")){
                name_row2.setText(fullname);
                percentage_row2.setText(s);
            }else if( name_row3.getText().toString().equals("") &&  percentage_row3.getText().toString().equals("")){
                name_row3.setText(fullname);
                percentage_row3.setText(s);
            }else if( name_row4.getText().toString().equals("") &&  percentage_row4.getText().toString().equals("")){
                name_row4.setText(fullname);
                percentage_row4.setText(s);
            }



        }

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}