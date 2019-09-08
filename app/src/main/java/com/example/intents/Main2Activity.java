package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt_usuario = findViewById(R.id.txt_usuario);

        Intent intent = getIntent();
        String usuario = intent.getStringExtra("id");
        txt_usuario.setText("Bienvenido "+usuario);
    }
}
