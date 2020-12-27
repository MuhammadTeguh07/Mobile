package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.example.uts_mobile.App.CHANNEL_1_ID;

public class DashboardActivity extends AppCompatActivity {
    Button btNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        FloatingActionButton klik = findViewById(R.id.floating_action_button);
        klik.setOnClickListener(v -> {
            Intent intent_1 = new Intent(DashboardActivity.this,AktorActivity.class);
            startActivity(intent_1);
        });

        TextView klik1 = findViewById(R.id.textView17);
        klik1.setOnClickListener(v -> {
            Intent intent_1 = new Intent(DashboardActivity.this,TanggapanActivity1.class);
            startActivity(intent_1);
        });

        btNotification = findViewById(R.id.btnNotif);

        btNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Pasien 1";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(
                        DashboardActivity.this
                )
                        .setSmallIcon(R.drawable.ic_baseline_message_24)
                        .setContentTitle("Voulentir")
                        .setContentText(message)
                        .setAutoCancel(true);

                Intent intent = new Intent(DashboardActivity.this,
                        TanggapanActivity1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message",message);

                PendingIntent pendingIntent = PendingIntent.getActivity(DashboardActivity.this,
                        0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager notificationManager = (NotificationManager)getSystemService(
                        Context.NOTIFICATION_SERVICE
                );
                notificationManager.notify(0,builder.build());
            }
        });

    }

}

