package com.example.android.tourguidebucharest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button beginButton = (Button) findViewById(R.id.begin_button);

        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutBucharestIntent = new Intent(MainActivity.this, AboutBucharest.class);
                startActivity(aboutBucharestIntent);
            }
        });
    }
}
