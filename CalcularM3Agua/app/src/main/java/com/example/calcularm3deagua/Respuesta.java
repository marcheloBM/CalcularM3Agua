package com.example.calcularm3deagua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {

    TextView textoFinal,textoFinal2,textoFinal3,textoAncho,textoAlto,textoLargo,textoBidon,textoGalon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);
        textoFinal = (TextView)findViewById(R.id.textView2);
        textoFinal2 = (TextView)findViewById(R.id.textView3);
        textoFinal3 = (TextView)findViewById(R.id.textView4);
        textoAncho = (TextView)findViewById(R.id.textAncho);
        textoAlto = (TextView)findViewById(R.id.textAltura);
        textoLargo = (TextView)findViewById(R.id.textLargo);
        textoBidon = (TextView)findViewById(R.id.textView6);
        textoGalon = (TextView)findViewById(R.id.textView8);

        //recupero la informacion de la ventana anterior
        Intent intent = getIntent();
        Bundle extra = this.getIntent().getExtras();
        int ancho = extra.getInt("ancho");
        int altura = extra.getInt("altura");
        int largo = extra.getInt("largo");

        int calculo = extra.getInt("calculo");
        int calculo2 = extra.getInt("calculo2");
        int calculo3 = calculo-calculo2;
        int bidones = calculo2/20;
        int galones = 3785/calculo2;

        textoAncho.setText(""+ancho);
        textoAlto.setText(""+altura);
        textoLargo.setText(""+largo);
        textoFinal.setText("Capacidad Total de Agua: "+calculo+" m3");
        textoFinal2.setText("Capacidad de Agua: "+calculo2+" m3");
        textoFinal3.setText("Capacidad de Agua Libre: "+calculo3+" m3");
        textoBidon.setText("Cantidad de Bidones 20L: "+bidones);
        textoGalon.setText("Cantidad de Galones 3.7L: "+galones);
    }
}
