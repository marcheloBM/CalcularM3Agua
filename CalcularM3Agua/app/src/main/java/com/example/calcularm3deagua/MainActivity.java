package com.example.calcularm3deagua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button)findViewById(R.id.button);
        btnSubmit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //Recuperar valores de controles
        int Ancho = Integer.parseInt(((EditText) findViewById(R.id.ancho)).getText().toString());
        int Altura = Integer.parseInt(((EditText) findViewById(R.id.altura)).getText().toString());
        int Largo = Integer.parseInt(((EditText) findViewById(R.id.largo)).getText().toString());
        int Hivel = Integer.parseInt(((EditText) findViewById(R.id.nivel)).getText().toString());

        int resp = (Ancho*Altura*Largo)/1000;
        int resp2 = (Ancho*Hivel*Largo)/1000;
        // envia datos a otra ventena
        Intent i = new Intent(this, Respuesta.class);
        i.putExtra("calculo",resp);
        i.putExtra("calculo2",resp2);
        i.putExtra("ancho",Ancho);
        i.putExtra("altura",Altura);
        i.putExtra("largo",Largo);
        startActivity(i);
    }
}
