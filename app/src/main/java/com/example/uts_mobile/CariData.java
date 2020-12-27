package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CariData extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter; //bertugas utk mengirim ArrayList ke recyclerview
    private RecyclerView.LayoutManager mLayoutManager; //bertugas mengatur layout pada recyclerview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_data);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.dokter_laki, R.drawable.ibu_hamil, "Dokter 1", "Pasien 1"));
        exampleList.add(new ExampleItem(R.drawable.dokter_wanita, R.drawable.ibu_hamil, "Dokter 2", "Pasien 2"));
        exampleList.add(new ExampleItem(R.drawable.dokter_laki, R.drawable.ibu_hamil, "Dokter 1", "Pasien 3"));

        mRecyclerView = findViewById(R.id.recyclerView);
        //gunakan setHasFixedSize = true agar ukuran recylerview tidak berubah
        //ketika isi dari recyclerview secara dinamis berubah
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void backToHome(View view) {
        Intent back = new Intent(CariData.this, MenuVoulentir.class);
        startActivity(back);
    }

    public void dataDetail1(View view) {
        Intent detail1 = new Intent(CariData.this, DataDetail.class);
        startActivity(detail1);
    }

}
