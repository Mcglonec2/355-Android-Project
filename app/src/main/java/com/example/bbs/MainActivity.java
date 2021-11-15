package com.example.bbs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivityTag";

    Button fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_fragment);

//        fragment = findViewById(R.id.Finder);
//        fragment.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.Finder) {
            getSupportFragmentManager().beginTransaction().add(R.id.mapsFragment, new MapsFragment()).commit();
        }
    }
}