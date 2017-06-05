package com.example.corei7.examen3lp;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;


public class Display extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        String usuario = getIntent().getStringExtra("Usuario");

        TextView tv = (TextView) findViewById(R.id.etUsuario);
        tv.setText(usuario);
    }



}
