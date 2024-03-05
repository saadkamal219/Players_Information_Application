package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AllInOne extends AppCompatActivity {

    private ImageView image;
    private TextView text, details;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_in_one);

        image = findViewById(R.id.anyimage);
        text = findViewById(R.id.text);
        details = findViewById(R.id.details);

        Bundle bundle =

    }
}