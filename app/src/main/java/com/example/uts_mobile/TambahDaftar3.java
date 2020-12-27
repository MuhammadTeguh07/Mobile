package com.example.uts_mobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TambahDaftar3 extends AppCompatActivity {

    private Button btn_simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_daftar3);

        btn_simpan = (Button) findViewById(R.id.id_btn_simpan);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Berhasil Mendaftar")
                .setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        Intent login = new Intent(TambahDaftar3.this, MenuVoulentir.class);
                        startActivity(login);
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }

    public void back(View view) {
        Intent back = new Intent(TambahDaftar3.this, TambahDaftar2.class);
        startActivity(back);
    }
    public void backToHome(View view) {
        Intent back = new Intent(TambahDaftar3.this, MenuVoulentir.class);
        startActivity(back);
    }
    public void simpan(View view) {
        Intent back = new Intent(TambahDaftar3.this, MainActivity.class);
        startActivity(back);
    }
}
