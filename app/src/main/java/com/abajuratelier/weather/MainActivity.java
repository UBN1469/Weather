package com.abajuratelier.weather;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Constants{
    private final static int REQUEST_CODE = 1 ; // Константа

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState;

        ImageView setting = findViewById(R.id.setting );
        TextView city = findViewById(R.id.city);

        setting.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast. makeText (MainActivity. this , "button2 ClickListener event!" ,
//                        Toast. LENGTH_SHORT ).show();
                startActivity(new Intent(MainActivity.this, SettingActivity.class));

            }
        });

        city.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast. makeText (MainActivity. this , "button2 ClickListener event!" ,
//                        Toast. LENGTH_SHORT ).show();
                //startActivity(new Intent(MainActivity.this,CityActivity.class));
                Intent intent = new Intent(MainActivity.this,CityActivity.class);
                startActivityForResult(intent,REQUEST_CODE);

            }
        });


    }
    //Также добавляем обработку результата работы второй активити:


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != REQUEST_CODE){
        super.onActivityResult(requestCode, resultCode, data);
        return;
        }
        if (resultCode == RESULT_OK){
            TextView textViewCity = findViewById(R.id.city);
            textViewCity.setText(data.getStringExtra(CITY));

        }
    }

    //Методы жизненого цикла:
    @Override
    protected void onStart() {
        super .onStart();
        Toast. makeText (getApplicationContext(), "onStart()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onStart()" );
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super .onRestoreInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "Повторный запуск!! - onRestoreInstanceState()" );
    }
    @Override
    protected void onResume() {
        super .onResume();
        Toast. makeText (getApplicationContext(), "onResume()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onResume()" );

    }
    @Override
    protected void onPause() {
        super .onPause();
        Toast. makeText (getApplicationContext(), "onPause()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onPause()" );
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super .onSaveInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "onSaveInstanceState()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onSaveInstanceState()" );
    }
    @Override
    protected void onStop() {
        super .onStop();
        Toast. makeText (getApplicationContext(), "onStop()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onStop()" );
    }
    @Override
    protected void onRestart() {
        super .onRestart();
        Toast. makeText (getApplicationContext(), "onRestart()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onRestart()" );
    }
    @Override
    protected void onDestroy() {
        super .onDestroy();
        Toast. makeText (getApplicationContext(), "onDestroy()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onDestroy()"  );

    }
}