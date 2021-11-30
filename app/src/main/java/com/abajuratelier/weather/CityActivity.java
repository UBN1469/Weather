package com.abajuratelier.weather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityActivity extends AppCompatActivity implements Constants{
   TextView editTextinterTheCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        TextView textViewMoscow = findViewById(R.id.textMoscow);
        textViewMoscow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextinterTheCity = findViewById(R.id.interTheCity);
                editTextinterTheCity.setText("Moscow");
                //Intent intentResult =new Intent();
                //intentResult.putExtra(CITY,textViewMoscow.getText().toString());
                //setResult(RESULT_OK, intentResult);
            }
        });
        TextView textViewSaintPetersburg = findViewById(R.id.textSaintPetersburg);
        textViewSaintPetersburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextinterTheCity = findViewById(R.id.interTheCity);
                editTextinterTheCity.setText("Saint-Petersburg");
            }
        });




        Button buttoninterTheCity = findViewById(R.id.buttonInterTheCity);
        buttoninterTheCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextinterTheCity = findViewById(R.id.interTheCity);
                TextView editTextTemperature = findViewById(R.id.editTextTemperature);


                Intent intentResult =new Intent();
                intentResult.putExtra(CITY,editTextinterTheCity.getText().toString());
                setResult(RESULT_OK, intentResult);
                intentResult.putExtra(TEMPERATURE,editTextTemperature.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();
            }
        });

        final  Presenter presenter = Presenter.getInstance();
        TextView editTextTemperature = findViewById(R.id.editTextTemperature); ;
        editTextTemperature.setText(((Integer)presenter.getCounter()).toString());


        Button buttonIncreaseTemp = findViewById((R.id.increaseTemperature));
        buttonIncreaseTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.incrementTempreche();
                editTextTemperature.setText(((Integer)presenter.getCounter()).toString());

            }
        });




    }
}
