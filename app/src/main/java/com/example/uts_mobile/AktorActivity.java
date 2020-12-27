package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AktorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktor);

        View klik = (View) findViewById(R.id.AktVol);
        klik.setOnClickListener(v -> {
            Intent intent_1 = new Intent(AktorActivity.this,LoginVolActivity.class);
            startActivity(intent_1);
        });

        View klik1 = (View) findViewById(R.id.AktDok);
        klik1.setOnClickListener(v -> {
            Intent intent_1 = new Intent(AktorActivity.this,LoginDokActivity.class);
            startActivity(intent_1);
        });
    }
}