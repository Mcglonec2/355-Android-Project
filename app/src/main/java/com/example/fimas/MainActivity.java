package com.example.fimas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static int bg = 0;
    private static int[] backgrounds = new int[] {R.drawable.red, R.drawable.orange, R.drawable.yellow, R.drawable.green,
            R.drawable.blue, R.drawable.purple, R.drawable.grey};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        updateBackground();
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        Button play = (Button) findViewById(R.id.play);
        Button scores = (Button) findViewById(R.id.scores);
        Button bgchanger = (Button) findViewById(R.id.BGChange);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked play button");
                Intent intent = new Intent(MainActivity.this, DifficultyScreen.class);
                startActivity(intent);
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked scores button");

                Intent intent = new Intent(MainActivity.this, ScoresScreen.class);
                startActivity(intent);
            }
        });

        bgchanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBackground();
            }
        });
    }

    public void changeBackground() {
        if (bg < 6) bg++;
        else bg = 0;
        updateBackground();
    }

    public void updateBackground() {
        getWindow().getDecorView().setBackground(getDrawable(backgrounds[bg]));
    }
}
