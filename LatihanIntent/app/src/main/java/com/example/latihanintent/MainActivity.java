package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button vokal;
    Button tari;
    Button akting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vokal = (Button)findViewById(R.id.vokal);
        vokal.setOnClickListener(this);
        tari = (Button)findViewById(R.id.tari);
        tari.setOnClickListener(this);
        akting = (Button)findViewById(R.id.akting);
        akting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.vokal:
                Intent vokal = new Intent(MainActivity.this, VokalActivity.class);
                startActivity(vokal);
                break;
            case R.id.tari:
                Intent tari = new Intent(MainActivity.this, TariActivity.class);
                startActivity(tari);
                break;
            case R.id.akting:
                Intent akting = new Intent(MainActivity.this, AktingActivity.class);
                startActivity(akting);
                break;
            default:
                break;
        }
    }
}