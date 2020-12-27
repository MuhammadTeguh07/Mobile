package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DataDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_detail);

        TextView t3 = (TextView)findViewById(R.id.pasien);

        String text1 = getIntent().getExtras().getString("text1");
        String text2 = getIntent().getExtras().getString("text2");
        t3.setText(text2);
    }

    public void back(View view) {
        Intent back = new Intent(DataDetail.this, CariData.class);
        startActivity(back);
    }
}
