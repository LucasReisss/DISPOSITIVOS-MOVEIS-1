package br.unitins.appintent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        /*Intent intent = new Intent(getApplicationContext(), Tela2.class);
        startActivity(intent);
         */

        Intent intent = new Intent("br.unitins.action.TELA");
        startActivity(intent);
    }

    public void conf(View view) {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }
}