package lk.vinurachan.pizzahutdemo_native;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    static AppCompatActivity objMain = null;
    Handler handler = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        objMain = this;
        handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                //Create Intent for Reservation List Activity to Start The Activity
                Intent intentResListScrn = new Intent(objMain, LoginActivity.class);
                startActivity(intentResListScrn);
                finish();
            }
        }, 3000);
    }
}
