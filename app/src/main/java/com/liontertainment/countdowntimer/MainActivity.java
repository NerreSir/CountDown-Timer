package com.liontertainment.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textviewCD);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {
                textView.setText("Letf: " + l / 1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Done!!!", Toast.LENGTH_SHORT).show();
                textView.setText("Finish CountDown...");
            }
        }.start();

    }
}