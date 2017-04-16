package com.example.sijinsixin.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sijinsixin.ui.activity.MainActivity;

/**
 * Created by 鲍骞月 on 2017/4/16.
 */


/**
 * 闪屏页显示
 */

public class SplashActivity extends AppCompatActivity {
    private static final long SPLASH_DISPLAY_TIME = 3000;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//        finish();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_TIME);
    }
}
