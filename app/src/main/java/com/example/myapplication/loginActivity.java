package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void startprincipalActivity (View view) {
        Intent principalActivity = new Intent(this, principalActivity.class);
        startActivity(principalActivity);
    }
    public void startcadastroActivity (View view) {
        Intent cadastroActivity = new Intent(this, cadastroActivity.class);
        startActivity(cadastroActivity);
    }
}