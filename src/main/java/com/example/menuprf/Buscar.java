package com.example.menuprf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Buscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
    }
    public void IraMenu(View view)
    {
        Intent IraMenu = new Intent(this, MainActivity.class);
        startActivity(IraMenu);
    }




}