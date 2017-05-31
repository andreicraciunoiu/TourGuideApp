package com.example.android.tourguidebucharest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutBucharest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_bucharest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button detailsButton = (Button) findViewById(R.id.details_id);
        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(AboutBucharest.this, DetailsActivity.class);
                startActivity(detailsIntent);
            }
        });
        Button continueButton = (Button) findViewById(R.id.continue_id);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continueIntent = new Intent(AboutBucharest.this, WhatToDoInBucharest.class);
                startActivity(continueIntent);
                Toast.makeText(AboutBucharest.this, "Tap on item for location", Toast.LENGTH_LONG).show();
            }
        });
    }
}