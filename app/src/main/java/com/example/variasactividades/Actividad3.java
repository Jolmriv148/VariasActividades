package com.example.variasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        TextView tv=findViewById(R.id.tv);

        //Obtenemos el Intent asociado a la actvidad anterior
        Intent intent=getIntent();

        //Obtenemos los datos
        Bundle datos=intent.getExtras();
        int n1=datos.getInt("numero1");
        int n2=datos.getInt("numero2");
        String op=datos.getString("operacion");

        //Hacemos la operación

        switch (op){
            case "sumar":
                int resultado=n1+n2;
                tv.setText("La suma es: "+resultado);
                break;
            case "restar":
                resultado=n1-n2;
                tv.setText("La resta es: "+resultado);
                break;
            case "multiplicar":
                resultado=n1*n2;
                tv.setText("La multiplicación es: "+resultado);
                break;
            case "dividir":
                resultado=n1/n2;
                tv.setText("La división es: "+resultado);
                break;
        }




    }

    public void salir(View view) {
        finish();
    }
}