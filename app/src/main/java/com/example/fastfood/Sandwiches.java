package com.example.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.fastfood.model.Sandwich;

public class Sandwiches extends AppCompatActivity implements View.OnClickListener {

    Button chacarero_btn, barrosLuco_btn, italiano_btn, cebollero_btn, extraVegetal_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        //Flecha atrás
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        chacarero_btn = (Button) findViewById(R.id.chacarero_btn);
        barrosLuco_btn = (Button) findViewById(R.id.barrosLuco_btn);
        italiano_btn = (Button) findViewById(R.id.italiano_btn);
        cebollero_btn = (Button) findViewById(R.id.cebollero_btn);
        extraVegetal_btn = (Button) findViewById(R.id.extraVegetal_btn);

        chacarero_btn.setOnClickListener(this);
        barrosLuco_btn.setOnClickListener(this);
        italiano_btn.setOnClickListener(this);
        cebollero_btn.setOnClickListener(this);
        extraVegetal_btn.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Sandwiches.this, Detalle.class);
        Bundle bundle = new Bundle();

        switch (v.getId()){
            case R.id.chacarero_btn:
                Sandwich chacarero = new Sandwich("Sandwich Chacarero",
                                                        R.drawable.chacarero,
                                                        R.string.descripcionChacarero_txt,
                                                        R.string.precio_txt);

                bundle.putSerializable("sandwich", chacarero);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.barrosLuco_btn:
                Sandwich barrosLuco = new Sandwich("Sandwich Barros Luco",
                        R.drawable.barrosluco,
                        R.string.descripcionBarrosLuco_txt,
                        R.string.precio_txt);

                bundle.putSerializable("sandwich", barrosLuco);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.italiano_btn:
                Sandwich italiano = new Sandwich("Sandwich Italiano",
                        R.drawable.italiano,
                        R.string.descripcionItaliano_txt,
                        R.string.precio_txt);

                bundle.putSerializable("sandwich", italiano);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.cebollero_btn:
                Sandwich cebollero = new Sandwich("Sandwich Cebollero",
                        R.drawable.cebollero,
                        R.string.descripcionCebollero_txt,
                        R.string.precio_txt);

                bundle.putSerializable("sandwich", cebollero);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.extraVegetal_btn:
                Sandwich extraVegetal = new Sandwich("Sandwich Extra Vegetal",
                        R.drawable.extravegetal,
                        R.string.descripcionExtraVegetal_txt,
                        R.string.precio_txt);

                bundle.putSerializable("sandwich", extraVegetal);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }
    }
}
