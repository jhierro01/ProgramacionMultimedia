package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = (Button) findViewById(R.id.b0);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button b5 = (Button) findViewById(R.id.b5);
        Button b6 = (Button) findViewById(R.id.b6);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button b9 = (Button) findViewById(R.id.b9);
        Button b10 = (Button) findViewById(R.id.b10);
        Button b11 = (Button) findViewById(R.id.b11);
        Button b12 = (Button) findViewById(R.id.b12);
        Button b13 = (Button) findViewById(R.id.b13);
        Button b14 = (Button) findViewById(R.id.b14);
        Button b15 = (Button) findViewById(R.id.b15);
        TextView textito = (TextView) findViewById(R.id.textito);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("0");
                CharSequence cero = textito.getText();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("9");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.setText("");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("+");
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("-");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("*");
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.append("/");
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    }
