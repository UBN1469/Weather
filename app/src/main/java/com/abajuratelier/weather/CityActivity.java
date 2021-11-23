package com.abajuratelier.weather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityActivity extends AppCompatActivity implements Constants{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        TextView textViewMoscow = findViewById(R.id.textMoscow);

        Button buttoninterTheCity = findViewById(R.id.buttonInterTheCity);
        buttoninterTheCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.interTheCity);
                Intent intentResult =new Intent();
                intentResult.putExtra(CITY,editText.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();
            }
        });




    }
}
