package com.example.a1_appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtUser;
    private EditText edtPassword;
    private Button btnSingIn;

    /*CICLO DE VIDA : ONLOAD JAVASCRIPT*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Carga el activity_main : index.html o main java

        //document.getElementById("idUser");
        edtUser = findViewById(R.id.edtUser); //Getelemementbyid android
        edtPassword = findViewById(R.id.edtPassword);
        btnSingIn = findViewById(R.id.btnSingIn);
        //btnEnviar.addeventListener("click", "Bienvenido a JS");
        btnSingIn.setOnClickListener(new View.OnClickListener() { //Instacia una clase anonima, clase que se crea desde el método
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}