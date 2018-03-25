package com.example.zf.girls;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"轩辕铁牛","上官翠花","欧阳铁柱","二营长的意大利炮","李泽言"};

   // private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // imageView = (ImageView)findViewById(R.id.gifImageView2);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.hide();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data
        );
        ListView listView = (ListView)findViewById(R.id.recycler_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                if(position == 0) {intent.putExtra("data_return", "0");}
                if(position == 1) {intent.putExtra("data_return", "1");}
                if(position == 2) {intent.putExtra("data_return", "2");}
                if(position == 3) {intent.putExtra("data_return", "3");}
                if(position == 4) {intent.putExtra("data_return", "4");}
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
