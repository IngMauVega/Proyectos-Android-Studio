package com.example.menuprf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void IraRealizarVenta(View view)
{
    Intent Realizarventa = new Intent(this, VentaDiaria.class);
    startActivity(Realizarventa);
}
public void IraInventarios(View view)
{
    Intent Irainventario = new Intent(this, Inventario.class);
    startActivity(Irainventario);
}
public void IraUsuarios(View view)
{
    Intent Irausuarios = new Intent(this, Usuarios.class);
    startActivity(Irausuarios);
}
public void IrVentadiaria(View view)
{
    Intent IrVentadiaria = new Intent(this, RealizarVenta.class);
    startActivity(IrVentadiaria);
}
    public void IraBuscar(View view)
    {
        Intent IraBuscar = new Intent(this, Buscar.class);
        startActivity(IraBuscar);
    }



}