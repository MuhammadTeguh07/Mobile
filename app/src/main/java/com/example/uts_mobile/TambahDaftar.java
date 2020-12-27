package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TambahDaftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_daftar);
    }

    public void backToHome(View view) {
        Intent backToHome = new Intent(TambahDaftar.this, MenuVoulentir.class);
        startActivity(backToHome);
    }
    
    public void Btn_Next(View view) {
        Intent next = new Intent(TambahDaftar.this, TambahDaftar2.class);
        startActivity(next);
    }

}
