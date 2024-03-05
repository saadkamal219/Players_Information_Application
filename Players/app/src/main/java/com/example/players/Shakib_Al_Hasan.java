package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Shakib_Al_Hasan extends AppCompatActivity {

    private ImageView backfromSakib;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shakib_al_hasan);

        backfromSakib = findViewById(R.id.back);

        backfromSakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shakib_Al_Hasan.this, PlayerMenu.class);
                startActivity(intent);
            }
        });

    }
}