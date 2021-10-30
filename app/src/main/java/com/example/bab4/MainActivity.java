package com.example.bab4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MarketplaceAdapter adapter;
    private ArrayList<marketplace> marketplaceArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =(RecyclerView)findViewById(R.id.recycleview);
        adapter = new MarketplaceAdapter(marketplaceArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        marketplaceArrayList = new ArrayList<>();
        marketplaceArrayList.add(new marketplace("Kaos", "110", "Rizal", R.drawable.kaos));
        marketplaceArrayList.add(new marketplace("Kemeja", "340", "Ahmad",R.drawable.kemeja));
        marketplaceArrayList.add(new marketplace("Jaket", "670", "Fachrezi",R.drawable.jaket));
       }
}
