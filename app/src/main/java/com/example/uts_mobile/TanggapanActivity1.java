package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TanggapanActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggapan1);

        FloatingActionButton klik = findViewById(R.id.floating_action_button);
        klik.setOnClickListener(v -> {
            Intent intent_1 = new Intent(TanggapanActivity1.this,DashboardActivity.class);
            startActivity(intent_1);
        });

    }
}