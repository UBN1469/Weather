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
    private String city;
    private TextView textCity;
    private  String temperature;
    private TextView textTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView setting = findViewById(R.id.setting );
        textCity = findViewById(R.id.city);
        textTemperature = findViewById(R.id.temperature);

        setting.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast. makeText (MainActivity. this , "button2 ClickListener event!" ,
//                        Toast. LENGTH_SHORT ).show();
                startActivity(new Intent(MainActivity.this, SettingActivity.class));

            }
        });

        textCity.setOnClickListener( new View.OnClickListener() {
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
            //TextView textViewCity = findViewById(R.id.city);
            textCity.setText(data.getStringExtra(CITY));
            textTemperature.setText(data.getStringExtra(TEMPERATURE));

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
        city = saveInstanceState.getString(CITY_BUNDLE);
        textCity.setText((String)city.toString());

        temperature =saveInstanceState.getString(TEMPERATURE_BUNDLE);
        textTemperature.setText((String)temperature.toString());


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
        saveInstanceState.putString(CITY_BUNDLE,textCity.getText().toString());
        saveInstanceState.putString(TEMPERATURE_BUNDLE,textTemperature.getText().toString());

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