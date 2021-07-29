package com.sumit.broadcartreciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AiroplaneModeReciver airoplaneModeReciver;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        airoplaneModeReciver = new AiroplaneModeReciver(button);
        registerReceiver(airoplaneModeReciver, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));


    }

    public void button(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(airoplaneModeReciver);
    }

}