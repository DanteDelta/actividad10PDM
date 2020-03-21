package com.example.ejerciciolintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
    static boolean vista1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAceptar=(Button)findViewById(R.id.btnEnviar);
        final EditText edtNombre=(EditText)findViewById(R.id.edtNombre);

        if(vista1 == false) {
            String Nombre = "";

            Bundle extras = getIntent().getExtras();
            Nombre = extras.getString("Nombre");
            Nombre = Nombre.toLowerCase();
            edtNombre.setText(Nombre);
        }
        else
            vista1 = false;
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                String sNombre=edtNombre.getText().toString();
                intent.putExtra("Nombre",sNombre);
                startActivity(intent);
            }
        });
    }
}