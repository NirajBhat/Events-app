package com.sourcey.materiallogindemo.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sourcey.materiallogindemo.R;

public class SplashActivity extends AppCompatActivity {


        private Animation animFast, animSlow, animVerySlow;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            animFast = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.float_anim);
            animSlow = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.float_anim_slow);
            animVerySlow = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.float_anim_very_slow);
            findViewById(R.id.splash_image_1).startAnimation(animFast);
            findViewById(R.id.splash_image_2).startAnimation(animSlow);
            findViewById(R.id.splash_text_container).startAnimation(animVerySlow);

            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }, 2500);
        }
    }
