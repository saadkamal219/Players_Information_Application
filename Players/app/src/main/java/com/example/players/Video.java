package com.example.players;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView video;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        video = findViewById(R.id.video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.ocean;
        Uri videoUri = Uri.parse(videoPath);

        video.setVideoURI(videoUri);
        video.start();

    }
}