package com.example.cordobasmileclinic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String user1 = "Alvaro";
    String pass1 = "12345";

    String user2 = "Fulop";
    String pass2 = "chabola";

    EditText usuario;
    EditText pass;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.editTextUser);
        pass = findViewById(R.id.editTextPassword);

        btn = findViewById(R.id.buttonLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login(){
        // String consulta = "SELECT tipo FROM usuarios WHERE usuario = '"+usuario+"'";
        if (String.valueOf(usuario.getText()).equals(user1) && String.valueOf(pass.getText()).equals(pass1)){
            Intent login = new Intent(this, VentanaAdmin.class);
            startActivity(login);
            finish();
        } else if (String.valueOf(usuario.getText()).equals(user2) && String.valueOf(pass.getText()).equals(pass2)){
            Intent login = new Intent(this, VentanaUser.class);
            startActivity(login);
            finish();
        }
    }
}