import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import apps.jjv.tecnologicalimports.Login;
import apps.jjv.tecnologicalimports.R;
import apps.jjv.tecnologicalimports.contactenos;
import apps.jjv.tecnologicalimports.informacion;

public class Productos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para el boton Productos
    public void productos(View View){
        Intent productos = new Intent(this, Productos.class);
        startActivity(productos);
    }
    //Metodo para el boton Contactenos
    public void Contactenos(View View) {
        Intent contactenos = new Intent(this, apps.jjv.tecnologicalimports.contactenos.class);
        startActivity(contactenos);
    }

    //Metodo para el boton Informacion
    public void Informacion(View View) {
        Intent informacion = new Intent(this, apps.jjv.tecnologicalimports.informacion.class);
        startActivity(informacion);
    }

    //Metodo para el boton Login
    public void Login(View View) {
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }
}
