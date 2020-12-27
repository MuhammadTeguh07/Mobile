package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notifikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);
    }

    public void notif1(View view) {
        Intent notif1 = new Intent(Notifikasi.this, DataDetail.class);
        startActivity(notif1);
    }

    public void beranda(View view) {
        Intent beranda = new Intent(Notifikasi.this, MenuVoulentir.class);
        startActivity(beranda);
    }

    public void notifikasi(View view) {
        Intent notif = new Intent(Notifikasi.this, Notifikasi.class);
        startActivity(notif);
    }

    public void pengaturan(View view) {
        Intent pengaturan = new Intent(Notifikasi.this, Pengaturan.class);
        startActivity(pengaturan);
    }

}
