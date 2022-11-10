package com.example.cordobasmileclinic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VentanaUser extends AppCompatActivity {

    Button logout;

    TextView pedirCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_user);

        logout = findViewById(R.id.btnCerrarSesion);

        pedirCita = findViewById(R.id.textViewPedirCita);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarSesion();
            }
        });

        pedirCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cita();
            }
        });
    }

    public void cerrarSesion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Estás seguro que quieres cerrar sesión?");
        builder.setTitle("Cerrar Sesión");
        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    public void cita() {
        Intent citas = new Intent(this, VentanaCitasFechas.class);
        startActivity(citas);
        finish();
    }
}