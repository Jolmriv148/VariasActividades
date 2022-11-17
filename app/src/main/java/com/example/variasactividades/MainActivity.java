package com.example.variasactividades;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActivityResultLauncher<Intent> launcher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode()==RESULT_OK){
                //Obtenemos Intent
                Intent i=result.getData();
                //Obtenemos los datos
                Bundle datos=i.getExtras();
                String usuario=datos.getString("usuario");

                Toast.makeText(getApplicationContext(),"Se ha realizado el login de"+usuario,Toast.LENGTH_LONG).show();
            }else if(result.getResultCode()==RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"Se ha cancelado el login",Toast.LENGTH_LONG).show();
            }

        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent intentLogin=new Intent(this,Actividad1.class);
        launcher.launch(intentLogin);

    }

    public void calculadora(View view) {
        Intent intentCalc=new Intent(this,Actividad2.class);
        startActivity(intentCalc);
    }
}