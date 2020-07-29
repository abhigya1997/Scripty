package com.example.scripty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);

        ImageButton gujarati = (ImageButton)findViewById(R.id.btn3);

        gujarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, gujarati.class));
            }
        });

        ImageButton punjabi = (ImageButton)findViewById(R.id.btn1);

        punjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, punjabi.class));
            }
        });

        ImageButton marathi = (ImageButton)findViewById(R.id.btn2);

        marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, marathi.class));
            }
        });

        ImageButton hindi = (ImageButton)findViewById(R.id.btn4);

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, hindi.class));
            }
        });

        ImageButton devanagari = (ImageButton)findViewById(R.id.btn5);

        devanagari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, devanagari.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}