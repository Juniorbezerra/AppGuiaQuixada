package com.app.juniorbezerra.appguiaquixada.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.app.juniorbezerra.appguiaquixada.R;

public class SplashScreenActivity extends AppCompatActivity implements Runnable{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        Handler handler = new Handler();
        handler.postDelayed(this,3000);

    }

    @Override
    public void run() {
        startActivity(new Intent(this,PrincipalActivity.class));
        finish();
    }
}
