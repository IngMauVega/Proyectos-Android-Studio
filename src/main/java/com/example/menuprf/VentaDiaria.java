package com.example.menuprf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VentaDiaria extends AppCompatActivity {

private  TextView TOT;
    private EditText Cant;
    private EditText Name;
    private EditText Grm;
    private EditText Prd;

    private TextView Precio;
    private TextView Codigo;
    private TextView CampoName;
    private TextView CampoCant;
    private TextView CampoGr;
    private TextView CampoProducto;
    private TextView CampoPrecio;
    private Switch Concentrado;

    private TextView Codigo2;
    private TextView CampoName2;
    private TextView CampoCant2;
    private TextView CampoGr2;
    private TextView CampoProducto2;
    private TextView CampoPrecio2;

    private TextView Codigo3;
    private TextView CampoName3;
    private TextView CampoCant3;
    private TextView CampoGr3;
    private TextView CampoProducto3;
    private TextView CampoPrecio3;

    private TextView Codigo4;
    private TextView CampoName4;
    private TextView CampoCant4;
    private TextView CampoGr4;
    private TextView CampoProducto4;
    private TextView CampoPrecio4;

    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta_diaria);

        TOT = (TextView)findViewById(R.id.TOTAL);

        Cant = (EditText)findViewById(R.id.txtCant);
        Name = (EditText)findViewById(R.id.txtNom);
        Grm = (EditText)findViewById(R.id.txtgramos);
        Prd = (EditText)findViewById(R.id.txtproducto);
        Codigo = (TextView)findViewById(R.id.txtCodigo);
        Precio = (TextView)findViewById(R.id.txtPrecio);

       // tableLayout = (TableLayout)findViewById(R.id.Tabla);

        CampoCant = (TextView)findViewById(R.id.Campocant);
        CampoName = (TextView)findViewById(R.id.Camponame);
        CampoGr = (TextView)findViewById(R.id.Campogr);
        Codigo = (TextView)findViewById(R.id.Campocodigo);
        CampoProducto = (TextView)findViewById(R.id.Campoproducto);
        CampoPrecio = (TextView)findViewById(R.id.CampoPrecioP);


        CampoCant2 = (TextView)findViewById(R.id.campocant2);
        CampoName2 = (TextView)findViewById(R.id.camponame2);
        CampoGr2 = (TextView)findViewById(R.id.campogr2);
        Codigo2 = (TextView)findViewById(R.id.campocodigo2);
        CampoProducto2 = (TextView)findViewById(R.id.campoproducto2);
        CampoPrecio2 = (TextView)findViewById(R.id.campoPrecioP2);


        CampoCant3 = (TextView)findViewById(R.id.campocant3);
        CampoName3 = (TextView)findViewById(R.id.camponame3);
        CampoGr3 = (TextView)findViewById(R.id.campogr3);
        Codigo3 = (TextView)findViewById(R.id.campocodigo3);
        CampoProducto3 = (TextView)findViewById(R.id.campoproducto3);
        CampoPrecio3 = (TextView)findViewById(R.id.campoPrecioP3);


        CampoCant4 = (TextView)findViewById(R.id.campocant4);
        CampoName4 = (TextView)findViewById(R.id.camponame4);
        CampoGr4 = (TextView)findViewById(R.id.campogr4);
        Codigo4 = (TextView)findViewById(R.id.campocodigo4);
        CampoProducto4 = (TextView)findViewById(R.id.campoproducto4);
        CampoPrecio4 = (TextView)findViewById(R.id.campoPrecioP4);

    }
    public void IraMenu(View view)
    {
        Intent IraMenu = new Intent(this, MainActivity.class);
        startActivity(IraMenu);
    }



    public void Guardar (View view )
    {

        String cant = Cant.getText().toString();
        String name = Name.getText().toString();
        String grm = Grm.getText().toString();
        String prd = Prd.getText().toString();




        if (prd.isEmpty())
        {
            Toast.makeText(this,"Debes especificar un tipo de producto",Toast.LENGTH_LONG);
        }
        if (name.isEmpty())
        {
            Toast.makeText(this,"Debes especificar el nombre del producto",Toast.LENGTH_LONG);
        }
        //Si los campos de nombre y tipo de producto contienen algo pueden ser agregados
        if(name.length() != 0 && prd.length() != 0)
        {
            if (i==1)
            {
                Toast.makeText(this,"Producto agregado",Toast.LENGTH_LONG);
                Codigo.setText("1133");
                CampoGr.setText(grm);
                CampoCant.setText(cant);
                CampoName.setText(name);
                CampoProducto.setText(prd);
                CampoPrecio.setText(Total());
            }
            if (i==2)
            {
                Toast.makeText(this,"Producto agregado",Toast.LENGTH_LONG);
                Codigo2.setText("1133");
                CampoGr2.setText(grm);
                CampoCant2.setText(cant);
                CampoName2.setText(name);
                CampoProducto2.setText(prd);
                CampoPrecio2.setText(Total());
            }
            if (i==3)
            {
                Toast.makeText(this,"Producto agregado",Toast.LENGTH_LONG);
                Codigo3.setText("1133");
                CampoGr3.setText(grm);
                CampoCant3.setText(cant);
                CampoName3.setText(name);
                CampoProducto3.setText(prd);
                CampoPrecio3.setText(Total());
            }
            if (i==4)
            {
                Toast.makeText(this,"Producto agregado",Toast.LENGTH_LONG);
                Codigo4.setText("1133");
                CampoGr4.setText(grm);
                CampoCant4.setText(cant);
                CampoName4.setText(name);
                CampoProducto4.setText(prd);
                CampoPrecio4.setText(Total());
            }
            i = i + 1;

            limpiar();
        }
    }
public String Total()
{
    String esencia = Grm.getText().toString();
    int ESE = Integer.parseInt(esencia);
   // String Tipo=Prd.getText().toString();
    int precio=0;
        if(ESE > 9 && ESE < 13)
    {
        precio= 95;
    }
    if(ESE > 19 && ESE < 23)
    {
    precio =150;
    }
    if(ESE > 32 && ESE < 36)
    {
    precio = 250;
    }
    String juan = Cant.getText().toString();
    int pedro = Integer.parseInt(juan);
    int total = precio*pedro;
    String tot = String.valueOf(total);
    return tot;
}


    public void limpiar()
    {
        Grm.setText("");
        Cant.setText("1");
        Name.setText("");
        Prd.setText("");
        Precio.setText("");
    }
    public void envase30(View view)
    {
        Grm.setText("10");
        Prd.setText("Perfume 30ml");
    }
    public void envase60(View view)
    {
        Grm.setText("20");
        Prd.setText("Perfume 60ml");
    }
    public void envase120(View view)
    {
        Grm.setText("33");
        Prd.setText("Perfume 120ml");
    }
public  void Concentrado(View view)
    {
        Concentrado = (Switch)findViewById(R.id.CRT);
        Concentrado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    String gr=CampoGr.getText().toString();
                    int GR=Integer.parseInt(gr)+2;
                    CampoGr.setText(GR);
                }
                else{

                }
            }
        });
    }
public void Suma(View view)
{

    int suma=0;
   suma= Integer.parseInt(CampoPrecio.getText().toString())+Integer.parseInt(CampoPrecio2.getText().toString())+Integer.parseInt(CampoPrecio3.getText().toString()+Integer.parseInt(CampoPrecio4.getText().toString()));
   TOT.setText(String.valueOf(suma));
}




}