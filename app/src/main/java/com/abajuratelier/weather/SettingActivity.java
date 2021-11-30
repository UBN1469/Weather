package com.abajuratelier.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
    //Методы жизненого цикла:
    @Override
    protected void onStart() {
        super .onStart();
        Toast. makeText (getApplicationContext(), "onStart()" , Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onStart()" );
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super .onRestoreInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()" , Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "Повторный запуск!! - onRestoreInstanceState()" );
    }
    @Override
    protected void onResume() {
        super .onResume();
        Toast. makeText (getApplicationContext(), "onResume()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onResume()" );

    }
    @Override
    protected void onPause() {
        super .onPause();
        Toast. makeText (getApplicationContext(), "onPause()" , Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onPause()" );
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super .onSaveInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "onSaveInstanceState()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onSaveInstanceState()" );
    }
    @Override
    protected void onStop() {
        super .onStop();
        Toast. makeText (getApplicationContext(), "onStop()" , Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onStop()" );
    }
    @Override
    protected void onRestart() {
        super .onRestart();
        Toast. makeText (getApplicationContext(), "onRestart()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onRestart()" );
    }
    @Override
    protected void onDestroy() {
        super .onDestroy();
        Toast. makeText (getApplicationContext(), "onDestroy()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("SettingActivity", "onDestroy()"  );

    }

}