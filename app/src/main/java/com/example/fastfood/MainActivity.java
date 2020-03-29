package com.example.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button opcion1_btn, opcion2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Flecha atrás
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        opcion1_btn = (Button) findViewById(R.id.opcion1_btn);
        opcion2_btn = (Button) findViewById(R.id.opcion2_btn);

        opcion1_btn.setOnClickListener(this);
        opcion2_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.opcion1_btn:
                Intent opcion1 = new Intent(MainActivity.this, Sandwiches.class);
                startActivity(opcion1);
                break;

            case R.id.opcion2_btn:
                Intent opcion2 = new Intent(MainActivity.this, About.class);
                startActivity(opcion2);
                break;
        }
    }

    //Flecha hacia atrás
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            AlertDialog.Builder salir = new AlertDialog.Builder(MainActivity.this);
            salir.setTitle("Cerrar aplicación");
            salir.setMessage("¿Está seguro que desea salir?");
            salir.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            salir.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //
                }
            });
            salir.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
