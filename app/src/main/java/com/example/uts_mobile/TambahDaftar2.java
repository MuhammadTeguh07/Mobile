package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TambahDaftar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_daftar2);
    }

    public void Btn_Next(View view) {
        Intent next = new Intent(TambahDaftar2.this, TambahDaftar3.class);
        startActivity(next);
    }

    public void backToHome(View view) {
        Intent back = new Intent(TambahDaftar2.this, MenuVoulentir.class);
        startActivity(back);
    }

    public void back(View view) {
        Intent back = new Intent(TambahDaftar2.this, TambahDaftar.class);
        startActivity(back);
    }
}
