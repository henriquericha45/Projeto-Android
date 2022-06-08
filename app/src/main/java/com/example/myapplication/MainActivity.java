package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void startmainActivity (View view) {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }

    public void startinicioActivity (View view) {
        Intent telainicialActivity = new Intent(this, telainicialActivity.class);
        startActivity(telainicialActivity);
    }

    public void startcadastroActivity (View view) {
        Intent cadastroActivity = new Intent(this, cadastroActivity.class);
        startActivity(cadastroActivity);
    }

    public void startloginActivity (View view) {
        Intent cadastroActivity = new Intent(this, loginActivity.class);
        startActivity(cadastroActivity);
    }

    public void startprincipalActivity (View view) {
        Intent principalActivity = new Intent(this, principalActivity.class);
        startActivity(principalActivity);
    }

    public void startcontaActivity (View view) {
        Intent contaActivity = new Intent(this, contaActivity.class);
        startActivity(contaActivity);
    }

    public void startenderecoActivity (View view) {
        Intent enderecoActivity = new Intent(this, enderecoActivity.class);
        startActivity(enderecoActivity);
    }
}