package com.mrrun.huyatabview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mrrun.huyatabview.R;
import com.mrrun.huyatabview.view.HuyaTabView;


public class MainActivity extends AppCompatActivity {

    private HuyaTabView huYaTabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        huYaTabView = findViewById(R.id.huyatabview);
        huYaTabView.setOnItemClickListener(new HuyaTabView.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "点击了" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
