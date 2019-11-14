package com.hp.audioview;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2,btn3;
MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
         m=MediaPlayer.create(MainActivity.this,R.raw.tera_hoke_rahoon);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m.pause();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m.stop();
                m=MediaPlayer.create(MainActivity.this,R.raw.tera_hoke_rahoon);
            }
        });
    }
}
