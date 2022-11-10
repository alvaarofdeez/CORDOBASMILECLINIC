package com.example.cordobasmileclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VentanaCitasFechas extends AppCompatActivity {

    ListView listaFechas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_citas_fechas);

        listaFechas = (ListView) findViewById(R.id.listaCitas);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.arrayFechas, android.R.layout.simple_list_item_1);

        listaFechas.setAdapter(adapter);
    }
}