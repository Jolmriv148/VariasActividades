package com.example.variasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Actividad2 extends AppCompatActivity {

    EditText et1,et2;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        spinner=findViewById(R.id.spinner);

        String[] operaciones={"sumar","restar","multiplicar","dividir"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,operaciones);
        spinner.setAdapter(adapter);



    }

    public void verResultados(View view) {
        //Recogemos los datos
        int numero1=Integer.parseInt(et1.getText().toString());
        int numero2=Integer.parseInt(et2.getText().toString());
        String operacion=spinner.getSelectedItem().toString();

        //Creamos el Intent para ver la nueva actividad
        Intent intentVerResultados=new Intent(this,Actividad3.class);
        //Pasamos los datos
        intentVerResultados.putExtra("numero1",numero1);
        intentVerResultados.putExtra("numero2",numero2);
        intentVerResultados.putExtra("operacion",operacion);
        //Lanzamos la actividad
        startActivity(intentVerResultados);
    }

    public void salir(View view) {
        finish();
    }

}