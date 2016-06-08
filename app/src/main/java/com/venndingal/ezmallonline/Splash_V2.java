package com.venndingal.ezmallonline;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Splash_V2 extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__v2);

        context = this;

        final int secondsLeft = 0;

        new CountDownTimer(2000, 100) {
            public void onTick(long ms) {
                if (Math.round((float)ms / 1000.0f) != secondsLeft)
                {

                }
                Log.i("test","ms="+ms+" till finished="+secondsLeft );
            }

            public void onFinish() {
                Intent myIntent = new Intent(context, WebViewActivity.class);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(myIntent);
            }
        }.start();
    }
}
