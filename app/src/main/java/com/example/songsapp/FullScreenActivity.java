package com.example.songsapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class FullScreenActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);


        Intent intent3 = getIntent();
        String getData = intent3.getStringExtra("key");

        Log.d("key", "is passing");
        videoView = findViewById(R.id.fullScreen);

        String videoPath;

        if ("video1".equalsIgnoreCase(getData)) {


            videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;

            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);
            videoView.start();



            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    //start Previous Activity here

                    FullScreenActivity.this.finish();
                }
            });

            //MediaController m = new MediaController(this);
            //m.hide();
            //videoView.setMediaController(m);

            //m.setAnchorView(videoView);
        } else if ("video2".equalsIgnoreCase(getData)) {
            videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bakabaka;

            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            videoView.start();

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    //start Previous Activity here

                    FullScreenActivity.this.finish();
                }
            });

            //MediaController m = new MediaController(this);
            //videoView.setMediaController(m);
            //m.hide();

            //m.setAnchorView(videoView);
        } else if ("video3".equalsIgnoreCase(getData)) {
            videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bath;

            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            videoView.start();

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    //start Previous Activity here

                    FullScreenActivity.this.finish();
                }
            });
        }



    }
}
