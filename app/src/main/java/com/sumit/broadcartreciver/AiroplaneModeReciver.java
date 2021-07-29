package com.sumit.broadcartreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class AiroplaneModeReciver  extends BroadcastReceiver {
private  Button button;
    AiroplaneModeReciver(Button button){
this.button = button;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Hello Masai School", Toast.LENGTH_SHORT).show();
    }
}
