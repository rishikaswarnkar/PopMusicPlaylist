package net.androidbootcamp.autumplaylist;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btPiano,btViolin, btFlute;
    MediaPlayer mpPiano, mpViolin,mpFlute;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btPiano = (Button) findViewById(R.id.btnPiano);
        btViolin = (Button) findViewById(R.id.btnViolin);
        btFlute = (Button) findViewById(R.id.btnFlute);
       btPiano.setOnClickListener(bPaino);
       btViolin.setOnClickListener(bViolin);
        btFlute.setOnClickListener(bFlute);
        mpPiano = new MediaPlayer();
        mpPiano= MediaPlayer.create(this, R.raw.piano);
        playing=0;
        mpViolin = new MediaPlayer();
        mpViolin= MediaPlayer.create(this, R.raw.violin);
        playing=0;
        mpFlute = new MediaPlayer();
        mpFlute= MediaPlayer.create(this, R.raw.flute);
        playing=0;
    }//end onCrete
    Button.OnClickListener bPaino = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpPiano.start();
                    playing = 1;
                    btPiano.setText("Pause Pop-Piano Music");
                    btPiano.setVisibility(View.VISIBLE);
                    btViolin.setVisibility(View.INVISIBLE);
                    btFlute.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPiano.pause();
                    playing = 0;
                    btPiano.setText("Play Pop-Piano Music");
                    btViolin.setVisibility(View.VISIBLE);
                    btFlute.setVisibility(View.VISIBLE);
                    btPiano.setVisibility(View.VISIBLE);
                    break;
            }
        }//slide 36
    };
        Button.OnClickListener bViolin = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpViolin.start();
                        playing = 1;
                        btViolin.setText("Pause Pop-Violin Music");
                        btViolin.setVisibility(View.VISIBLE);
                        btPiano.setVisibility(View.INVISIBLE);
                        btFlute.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpViolin.pause();
                        playing = 0;
                        btViolin.setText("Play Pop-Violin Music");
                        btPiano.setVisibility(View.VISIBLE);
                        btFlute.setVisibility(View.VISIBLE);
                        btViolin.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };

        Button.OnClickListener bFlute = new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (playing) {
                        case 0:
                            mpFlute.start();
                            playing = 1;
                            btFlute.setText("Pause Pop-Flute Music");
                            btFlute.setVisibility(View.VISIBLE);
                            btPiano.setVisibility(View.INVISIBLE);
                            btViolin.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            mpFlute.pause();
                            playing = 0;
                            btFlute.setText("Play Pop-Flute Music");
                            btPiano.setVisibility(View.VISIBLE);
                            btFlute.setVisibility(View.VISIBLE);
                            btViolin.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            };
        }

