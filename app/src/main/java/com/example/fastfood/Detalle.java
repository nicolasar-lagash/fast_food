package com.example.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fastfood.model.Sandwich;

public class Detalle extends AppCompatActivity {

    ImageView imagen_img;
    TextView nombre_txt, descripcion_txt, precio_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Flecha atrás
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        nombre_txt = (TextView) findViewById(R.id.nombre_txt);
        descripcion_txt = (TextView) findViewById(R.id.descripcion_txt);
        precio_txt = (TextView) findViewById(R.id.precio_txt);
        imagen_img = (ImageView) findViewById(R.id.imagen_img);

        try {
            Intent intent = this.getIntent();
            Bundle bundle = intent.getExtras();
            Sandwich sandwich = (Sandwich) bundle.getSerializable("sandwich");

            try {
                String nombre = sandwich.getNombre();
                String descripcion = getResources().getString(sandwich.getDescripcion());
                String precio = getResources().getString(sandwich.getPrecio());
                Log.i("imagen", Integer.toString(sandwich.getImagen()));

                nombre_txt.setText(nombre);
                descripcion_txt.setText(descripcion);
                precio_txt.setText(precio);
                imagen_img.setImageResource(sandwich.getImagen());
            }catch (NullPointerException e){
                Toast.makeText(this, "Se ha producido un error", Toast.LENGTH_SHORT).show();
            }
        }catch (NullPointerException e){
            Toast.makeText(this, "Serializable error", Toast.LENGTH_SHORT).show();
        }
    }

    //Flecha atrás
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
