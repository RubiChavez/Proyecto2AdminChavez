package com.example.proyecto2adminchavez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {//inicia clase

    public Button btnVenta, btnContacto, btnProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //integracion de XML-JAVA
        btnVenta = findViewById(R.id.btnVenta);

        //Evento para abrir la nueva ventana
        btnVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirVenta = new Intent(getApplicationContext(), Venta.class);
                startActivity(abrirVenta);//startActivity(Intent intent)
            }
        });

        btnContacto = findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirContacto = new Intent(getApplicationContext(), Contacto.class);
                startActivity(abrirContacto);//startActivity(Intent intent)
            }
        });
        btnProducto = findViewById(R.id.btnProductos);
        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirProducto = new Intent(getApplicationContext(), Producto.class);
                startActivity(abrirProducto);//startActivity(Intent intent)
            }
        });

    }//termina onCreate
}//termina clase