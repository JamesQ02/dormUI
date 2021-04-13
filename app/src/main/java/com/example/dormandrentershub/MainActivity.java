package com.example.dormandrentershub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnSettings = findViewById(R.id.btnSettings);
        Button btnDorm1 = findViewById(R.id.btnDorm1);
        Button btnDorm2 = findViewById(R.id.btnDorm2);
        Button btnDorm3 = findViewById(R.id.btnDorm3);
        Button btnDorm4 = findViewById(R.id.btnDorm4);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,Settings.class);
                startActivity(int1);
            }
        });
        btnDorm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,Dorm1.class);
                startActivity(int2);
            }
        });
        btnDorm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,Dorm2.class);
                startActivity(int2);
            }
        });
        btnDorm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this,Dorm3.class);
                startActivity(int3);
            }
        });
        btnDorm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity.this,Dorm4.class);
                startActivity(int4);
            }
        });
    }
}