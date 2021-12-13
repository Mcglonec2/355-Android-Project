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
    public int bg = 1;
//    public Drawable[] backgrounds = {getDrawable(R.drawable.red),getDrawable(R.drawable.orange),getDrawable(R.drawable.yellow),
//            getDrawable(R.drawable.green),getDrawable(R.drawable.blue),getDrawable(R.drawable.purple),getDrawable(R.drawable.grey)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        Button play = (Button) findViewById(R.id.play);
        Button scores = (Button) findViewById(R.id.scores);
        Button bgchanger = (Button) findViewById(R.id.BGChange);
        RelativeLayout layoutM = findViewById(R.id.MainScreen);
        RelativeLayout layoutD = findViewById(R.id.DifficultyScreen);
        RelativeLayout layoutS = findViewById(R.id.ScoresScreen);


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
                Log.d(TAG, "onClick: Clicked backround change button");

                bg++;

                switch (bg) {
                    case 1:  layoutM.setBackground(getDrawable(R.drawable.red));break;
                    case 2:  layoutM.setBackground(getDrawable(R.drawable.orange));break;
                    case 3:  layoutM.setBackground(getDrawable(R.drawable.yellow));break;
                    case 4:  layoutM.setBackground(getDrawable(R.drawable.green));break;
                    case 5:  layoutM.setBackground(getDrawable(R.drawable.blue));break;
                    case 6:  layoutM.setBackground(getDrawable(R.drawable.purple));break;
                    case 7:  layoutM.setBackground(getDrawable(R.drawable.grey));break;
                    default: bg = 1;layoutM.setBackground(getDrawable(R.drawable.red));break;
                }

            }
        });
    }

    public void changeBackground() {

        bg++;


    }
}
//switch (bg[0]) {
//        case 1:{ layoutM.setBackground(getDrawable(R.drawable.red));
//        layoutD.setBackground(getDrawable(R.drawable.red));
//        layoutS.setBackground(getDrawable(R.drawable.red));
//        break;}
//
//        case 2:{ layoutM.setBackground(getDrawable(R.drawable.orange));
//        layoutD.setBackground(getDrawable(R.drawable.orange));
//        layoutS.setBackground(getDrawable(R.drawable.orange));
//        break;}
//
//        case 3:{ layoutM.setBackground(getDrawable(R.drawable.yellow));
//        layoutD.setBackground(getDrawable(R.drawable.yellow));
//        layoutS.setBackground(getDrawable(R.drawable.yellow));
//        break;}
//
//        case 4:{ layoutM.setBackground(getDrawable(R.drawable.green));
//        layoutD.setBackground(getDrawable(R.drawable.green));
//        layoutS.setBackground(getDrawable(R.drawable.green));
//        break;}
//
//        case 5:{ layoutM.setBackground(getDrawable(R.drawable.blue));
//        layoutD.setBackground(getDrawable(R.drawable.blue));
//        layoutS.setBackground(getDrawable(R.drawable.blue));
//        break;}
//
//        case 6:{ layoutM.setBackground(getDrawable(R.drawable.purple));
//        layoutD.setBackground(getDrawable(R.drawable.purple));
//        layoutS.setBackground(getDrawable(R.drawable.purple));
//        break;}
//
//        case 7:{ layoutM.setBackground(getDrawable(R.drawable.grey));
//        layoutD.setBackground(getDrawable(R.drawable.grey));
//        layoutS.setBackground(getDrawable(R.drawable.grey));
//        break;}
//
//default:{ bg[0] = 1;
//        layoutM.setBackground(getDrawable(R.drawable.red));
//        layoutD.setBackground(getDrawable(R.drawable.red));
//        layoutS.setBackground(getDrawable(R.drawable.red));
//        break;}
//        }