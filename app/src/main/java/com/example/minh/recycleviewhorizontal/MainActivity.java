package com.example.minh.recycleviewhorizontal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<SanPham> sanPhamArrayList;
    RecycleViewAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khoitao();
    }
    public void khoitao(){
        //Recycle View dạng ngang
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        sanPhamArrayList = new ArrayList<>();
        sanPhamArrayList.add(new SanPham("IPHONE","https://cdn3.tgdd.vn/Products/Images/44/113133/lenovo-ideapad-120s-11iap-450x300-1-230x153.jpg"));
        adapter = new RecycleViewAdapter(sanPhamArrayList,getApplicationContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        //RecycleView dạng dọc:
//        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
//        mangsanpham = new ArrayList<>();
//        sanPhamAdapter = new SanPhamAdapter(getApplicationContext(), mangsanpham);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
//        recyclerView.setAdapter(sanPhamAdapter);
    }
}
