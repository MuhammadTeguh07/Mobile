package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
    }

    public void beranda(View view) {
        Intent beranda = new Intent(Pengaturan.this, MenuVoulentir.class);
        startActivity(beranda);
    }

    public void notifikasi(View view) {
        Intent notif = new Intent(Pengaturan.this, Notifikasi.class);
        startActivity(notif);
    }

    public void pengaturan(View view) {
        Intent pengaturan = new Intent(Pengaturan.this, Pengaturan.class);
        startActivity(pengaturan);
    }

    public void logOut(View view) {
        Intent logOut = new Intent(Pengaturan.this, AktorActivity.class);
        startActivity(logOut);
    }
}
