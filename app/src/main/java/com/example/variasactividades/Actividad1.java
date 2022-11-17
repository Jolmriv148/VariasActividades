package com.example.variasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {

    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        et3=findViewById(R.id.et3);
    }

    public void cancelar(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void confirmar(View view) {

        Intent intent=new Intent();

        String usuario=et3.getText().toString();
        intent.putExtra("usuario",usuario);

        setResult(RESULT_OK,intent);

        finish();
    }
}