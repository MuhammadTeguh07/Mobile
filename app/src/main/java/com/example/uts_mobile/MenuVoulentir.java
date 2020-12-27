package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuVoulentir extends AppCompatActivity {
    Button btNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_voulentir);

        btNotification = findViewById(R.id.bt_notif);

        btNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Pasien 1";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(
                        MenuVoulentir.this
                )
                        .setSmallIcon(R.drawable.ic_baseline_message_24)
                        .setContentTitle("Dokter 1")
                        .setContentText(message)
                        .setAutoCancel(true);

                Intent intent = new Intent(MenuVoulentir.this,
                        DataDetail.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message",message);

                PendingIntent pendingIntent = PendingIntent.getActivity(MenuVoulentir.this,
                        0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager notificationManager = (NotificationManager)getSystemService(
                        Context.NOTIFICATION_SERVICE
                );
                notificationManager.notify(0,builder.build());
            }
        });
    }

    public void beranda(View view) {
        Intent beranda = new Intent(MenuVoulentir.this, MenuVoulentir.class);
        startActivity(beranda);
    }

    public void notifikasi(View view) {
        Intent notif = new Intent(MenuVoulentir.this, Notifikasi.class);
        startActivity(notif);
    }

    public void pengaturan(View view) {
        Intent pengaturan = new Intent(MenuVoulentir.this, Pengaturan.class);
        startActivity(pengaturan);
    }

    public void tambah(View view) {
        Intent tambah = new Intent(MenuVoulentir.this, TambahDaftar.class);
        startActivity(tambah);
    }

    public void cari(View view) {
        Intent cari = new Intent(MenuVoulentir.this, CariData.class);
        startActivity(cari);
    }
}
