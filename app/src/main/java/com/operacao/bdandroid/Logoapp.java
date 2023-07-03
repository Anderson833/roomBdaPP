package com.operacao.bdandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class Logoapp extends AppCompatActivity {

      private  final Timer timer = new Timer();
      TimerTask timerTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logoapp);

        getSupportActionBar().hide();

        timerTask  = new TimerTask() {
            @Override
            public void run() {
              runOnUiThread(new Runnable() {
                  @Override
                  public void run() {
                      passaTelaLogin();
                  }
              });
            }
        };

        timer.schedule(timerTask,5000);
 }

    private void passaTelaLogin() {
        Intent intent = new Intent(getApplicationContext(), FormLogin.class);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}