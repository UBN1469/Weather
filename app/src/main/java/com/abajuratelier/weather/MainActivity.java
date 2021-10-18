package com.abajuratelier.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView setting = findViewById(R.id.setting );
        setting.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast. makeText (MainActivity. this , "button2 ClickListener event!" ,
//                        Toast. LENGTH_SHORT ).show();
                startActivity(new Intent(MainActivity.this, SettingActivity.class));

            }
        });
    }
}