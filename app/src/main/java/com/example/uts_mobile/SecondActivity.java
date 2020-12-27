package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView t3 = (TextView)findViewById(R.id.textView3);
        TextView t4 = (TextView)findViewById(R.id.textView4);
        String text1 = getIntent().getExtras().getString("text1");
        String text2 = getIntent().getExtras().getString("text2");
        t3.setText(text1);
        t4.setText(text2);
    }
}
