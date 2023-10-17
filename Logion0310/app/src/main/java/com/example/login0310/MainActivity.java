package com.example.login0310;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login0310.Services.MainService;
import com.example.login0310.Services.ViewMain;

public class MainActivity extends AppCompatActivity implements ViewMain {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    private MainService mService = new MainService();


    /*PATRON SINGLETON*/
    private static MainActivity mainActivity = null;
    public static MainActivity getInstance(){
        return  mainActivity;
    };
    /*FIN PATRON SINGLETON*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity= this;
        innitComponents();

    }

    private void innitComponents(){
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to miami", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void show() {

    }
}