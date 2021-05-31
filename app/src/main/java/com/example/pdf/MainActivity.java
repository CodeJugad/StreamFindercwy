package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText percent,math, science;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        percent = (EditText) findViewById(R.id.percent);
        math = (EditText) findViewById(R.id.math);
        science = (EditText) findViewById(R.id.science);




            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int percen = Integer.parseInt(percent.getText().toString());
                    int mat = Integer.parseInt(math.getText().toString());
                    int scien = Integer.parseInt(science.getText().toString());
                    String percentL = percent.getText().toString();
                    String mathL = math.getText().toString();
                    String scienceL = science.getText().toString();

                    if(percentL.isEmpty() || mathL.isEmpty()|| scienceL.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Enter Your Marks",Toast.LENGTH_SHORT).show();
                    }


                    else if (60<=percen && 60<=scien && 60<=mat) {
                        Intent intent1 = new Intent(getApplicationContext(),Science.class);
                        startActivity(intent1);

                    } else{
                        if (50<=percen && 60<=mat && 30<=scien ) {
                            Intent intent2 = new Intent(getApplicationContext(),Commerce.class);
                            startActivity(intent2);

                        } else{
                            if (30<=percen) {
                                Intent intent3 = new Intent(getApplicationContext(),Arts.class);
                                startActivity(intent3);

                            } else if (percen<30 ) {
                                Toast.makeText(getApplicationContext(),"Fail",Toast.LENGTH_SHORT).show();
                            }


                        }
                    }

                }
            });
        }
    }
