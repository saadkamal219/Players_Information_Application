package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerMenu extends AppCompatActivity {

    private Button sakib, tamim, messi, neymar, rolando, rock, video;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_menu);

        sakib = findViewById(R.id.sakib);
        tamim = findViewById(R.id.tamim);
        messi = findViewById(R.id.messi);
        neymar = findViewById(R.id.neymar);
        rolando = findViewById(R.id.rolando);
        rock = findViewById(R.id.rock);
        video = findViewById(R.id.video);

        sakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Shakib_Al_Hasan.class);
                intent.putExtra("player", "");
                startActivity(intent);
            }
        });

        tamim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Tamim_Iqbal.class);
                startActivity(intent);
            }
        });

        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Lionel_Messi.class);
                startActivity(intent);
            }
        });

        neymar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Neymar.class);
                startActivity(intent);
            }
        });

        rolando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Cristiano_Ronaldo.class);
                startActivity(intent);
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, The_Rock.class);
                startActivity(intent);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerMenu.this, Video.class);
                startActivity(intent);
            }
        });

    }
}