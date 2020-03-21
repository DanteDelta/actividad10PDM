package com.example.ejerciciolintent;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnAtras= (Button) findViewById(R.id.btnAtras);
        final TextView txtNombre = (TextView) findViewById(R.id.txtNombre);
        String Nombre="";

        Bundle extras = getIntent().getExtras();
        Nombre=extras.getString("Nombre");
        Nombre = Nombre.toUpperCase();
        txtNombre.setText(Nombre);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                String iNombre= txtNombre.getText().toString();
                intent2.putExtra("Nombre",iNombre);
                startActivity(intent2);
            }
        });
    }
}