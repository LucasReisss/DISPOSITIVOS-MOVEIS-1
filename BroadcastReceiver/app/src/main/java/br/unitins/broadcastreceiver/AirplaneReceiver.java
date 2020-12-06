package br.unitins.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean airplaneModeOn = intent.getBooleanExtra("state", false);
        if (airplaneModeOn){
            Toast.makeText(context, "Modo avião ligado!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(context, "Modo avião desligado!", Toast.LENGTH_LONG).show();
        }

    }
}