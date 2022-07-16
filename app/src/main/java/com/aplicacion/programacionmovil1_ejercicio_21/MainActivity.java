package com.aplicacion.programacionmovil1_ejercicio_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnconsultarapi;
    Intent intentNavegar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setListeners();
    }

    private void init(){

        intentNavegar = null;

        btnconsultarapi = (Button) findViewById(R.id.btnconsultarapi);
    }

    private void setListeners(){
        btnconsultarapi.setOnClickListener(v -> irRetrofit());

    }

    private void irRetrofit(){

        intentNavegar = new Intent(getApplicationContext(), ActivityRetrofit.class);
        startActivity(intentNavegar);
    }


}