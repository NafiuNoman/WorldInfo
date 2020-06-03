package com.example.fragmen_2ndtry_03_06_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listview = findViewById(R.id.listid);

        String [] name = {"noman","rafiu","tony"};

        ArrayAdapter <String> adapter = new ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,name);


        listview.setAdapter(adapter);

        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
