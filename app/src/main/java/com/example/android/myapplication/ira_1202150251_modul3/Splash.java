package com.example.android.myapplication.ira_1202150251_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Memulai activity baru
                startActivity(new Intent(Splash.this, login.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                //Menutup activity saat ini
                finish();
            }
        }, 5000);
    }
}