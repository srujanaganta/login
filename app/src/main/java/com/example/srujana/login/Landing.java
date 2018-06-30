package com.example.srujana.login;

/**
 * Created by srujana on 11/6/18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Landing extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                //                 progress.setVisibility(View.GONE);


                Intent i = new Intent(Landing.this, Home.class);
                startActivity(i);


                // close this activity
                finish();

            }
        }, SPLASH_TIME_OUT);

    }

}
