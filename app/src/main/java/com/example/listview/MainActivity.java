package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView itemsLv =findViewById(R.id.itemsLv);



        String names[]={"Mialn","Diksha","Sanjeev","Karan","Nayan","Prachanda","Sangam","Sugam"};
        ArrayAdapter<String> adapter= new  ArrayAdapter<String>(this,R.layout.list_view_item,R.id.namesTv,names);

        itemsLv.setAdapter(adapter);
    }
}