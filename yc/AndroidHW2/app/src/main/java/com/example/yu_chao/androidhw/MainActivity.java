package com.example.yu_chao.androidhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.view.MenuItem;
import android.support.annotation.NonNull;


public class MainActivity extends AppCompatActivity{

    private TextView testText;
    private String[] data = {"test1", "test2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testText = (TextView) findViewById(R.id.text);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                        }
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                                MainActivity.this, android.R.layout.simple_list_item_1, data
                        );
                        ListView listView = (ListView) findViewById(R.id.list_view);
                        listView.setAdapter(adapter);
                        return false;
                    }
                }
        );
    }
}
