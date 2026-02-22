package com.example.miaplicacion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button btnLista, btnDetalles, btnContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLista = findViewById(R.id.btnLista);
        btnDetalles = findViewById(R.id.btnDetalles);
        btnContacto = findViewById(R.id.btnContacto);

        btnLista.setOnClickListener(v -> {
            Toast.makeText(this, "Botón Lista presionado", Toast.LENGTH_SHORT).show();
        });

        btnDetalles.setOnClickListener(v -> {
            Toast.makeText(this, "Botón Detalles presionado", Toast.LENGTH_SHORT).show();
        });

        btnContacto.setOnClickListener(v -> {
            Toast.makeText(this, "Botón Contacto presionado", Toast.LENGTH_SHORT).show();
        });
    }
}