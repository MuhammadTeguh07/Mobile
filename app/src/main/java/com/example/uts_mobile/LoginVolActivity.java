package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginVolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_vol);

        Button klik = findViewById(R.id.login);
        klik.setOnClickListener(v -> {
            Intent intent_1 = new Intent(LoginVolActivity.this,MenuVoulentir.class);
            startActivity(intent_1);
        });
    }
}