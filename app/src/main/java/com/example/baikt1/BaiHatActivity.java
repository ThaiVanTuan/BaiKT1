package com.example.baikt1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BaiHatActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<BaiHat> arrayBaiHat;
    BaiHatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baihat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        adapter = new BaiHatAdapter(this, R.layout.layoutbaihat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new BaiHat("Nguyễn Văn A", "Cấp bậc: Đại Úy",R.drawable.ca1,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn B", "Cấp bậc: Đại Úy",R.drawable.ca2,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn C", "Cấp bậc: Đại Úy",R.drawable.ca3,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn D", "Cấp bậc: Đại Úy",R.drawable.ca4,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn E", "Cấp bậc: Đại Úy",R.drawable.ca5,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn F", "Cấp bậc: Đại Úy",R.drawable.ca6,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn G", "Cấp bậc: Đại Úy",R.drawable.ca7,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn H", "Cấp bậc: Đại Úy",R.drawable.ca8,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn I", "Cấp bậc: Đại Úy",R.drawable.ca9,"Nơi công tác: Đà Nẵng","Số sao: 2"));
        arrayBaiHat.add(new BaiHat("Nguyễn Văn J", "Cấp bậc: Đại Úy",R.drawable.ca10,"Nơi công tác: Đà Nẵng","Số sao: 2"));

    }


}
