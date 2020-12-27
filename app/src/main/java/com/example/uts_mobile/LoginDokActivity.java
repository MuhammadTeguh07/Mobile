package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginDokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dok);

        Button klik = findViewById(R.id.login);
        klik.setOnClickListener(v -> {
            Intent intent_1 = new Intent(LoginDokActivity.this,DashboardActivity.class);
            startActivity(intent_1);
        });
    }

    public void btnBackDok(View view) {
        Intent back = new Intent(LoginDokActivity.this, AktorActivity.class);
        startActivity(back);
    }
}