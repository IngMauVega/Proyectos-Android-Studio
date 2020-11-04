package com.example.menuprf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Usuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
    }
    public void IraMenu(View view)
    {
        Intent IraMenu = new Intent(this, MainActivity.class);
        startActivity(IraMenu);
    }
}