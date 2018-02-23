package com.example.mariabelen.movilesproyectojuego;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity1 extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override     protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT );
        requestWindowFeature(Window. FEATURE_NO_TITLE );
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN );

        setContentView(R.layout. activity_splash1 );

        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {

                Intent mainIntent = new Intent().setClass(
                        SplashActivity1.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY );
    }
}
