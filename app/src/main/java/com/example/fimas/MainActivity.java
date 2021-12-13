package com.example.fimas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        /* Button play = (Button) findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked play button");

                Intent intent = new Intent(MainActivity.this, DifficultyScreen.class);
                startActivity(intent);
            }
        });

        Button scores = (Button) findViewById(R.id.scoreButton);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked play button");

                Intent intent = new Intent(MainActivity.this, ScoresScreen.class);
                startActivity(intent);
            }
        }); */
    }
}