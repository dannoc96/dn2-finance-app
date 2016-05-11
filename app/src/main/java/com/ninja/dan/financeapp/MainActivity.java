package com.ninja.dan.financeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alphabet = (Button) findViewById(R.id.button);
        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                startActivity(intent);
            }
        });

        Button facebook = (Button) findViewById(R.id.button2);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(intent);
            }
        });

        Button microsoft = (Button) findViewById(R.id.button3);
        microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MicrosoftActivity.class);
                startActivity(intent);
            }
        });

    }
}
