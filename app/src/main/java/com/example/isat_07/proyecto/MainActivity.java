package com.example.isat_07.proyecto;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo para el boton Productos
    public void productos(View View) {
        Intent productos = new Intent(this, productos.class);
        startActivity(productos);
    }

    //Metodo para el boton Contactenos
    public void Contactenos(View View) {
        Intent contactenos = new Intent(this, contactenos.class);
        startActivity(contactenos);
    }

    //Metodo para el boton Informacion
    public void Informacion(View View) {
        Intent informacion = new Intent(this, informacion.class);
        startActivity(informacion);
    }

    //Metodo para el boton Login
    public void Login(View View) {
        Intent login = new Intent(this, login.class);
        startActivity(login);
    }
}
