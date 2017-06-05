package com.example.corei7.examen3lp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }


    public  void onButtonClick(View v) {
        if (v.getId() == R.id.btnEntrar) {


            EditText a = (EditText) findViewById(R.id.ettUsuario);
            String str = a.getText().toString();
            EditText b = (EditText) findViewById(R.id.ettContraseña);
            String contra = b.getText().toString();

            String contraseña = helper.searchContraseña(str);
            if (contra.equals(contraseña)) {

                Intent i = new Intent(Login.this, Display.class);
                i.putExtra("Usuario", str);
                startActivity(i);
            } else {
                Toast temp = Toast.makeText(Login.this, "El usuario y la contraseña no coincide!", Toast.LENGTH_SHORT);
                temp.show();
            }
            if (v.getId() == R.id.btnEntrar) {
                Intent i = new Intent(Login.this, Tab.class);
                startActivity(i);
            }

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void regis (View v){
        Intent i = new Intent(Login.this,Registrarse.class);
                startActivity(i);
    }
}
