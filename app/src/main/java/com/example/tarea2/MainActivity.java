package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtname, txtedad, txtape, txtcorreo;
    Button btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname =(EditText) findViewById(R.id.txtname);
        txtape =(EditText) findViewById(R.id.txtape);
        txtedad =(EditText) findViewById(R.id.txtedad);
        txtcorreo =(EditText) findViewById(R.id.txtcorreo);

        btnenviar= (Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nm = String.valueOf(txtname.getText());
                String ape = String.valueOf(txtape.getText());
                String edad = String.valueOf(txtedad.getText());
                String correo = String.valueOf(txtcorreo.getText());


                Intent intent = new Intent(getApplicationContext(), ActivityInformacion.class);
                intent.putExtra("datonm", nm);
                intent.putExtra("datoap", ape);
                intent.putExtra("datoed", edad);
                intent.putExtra("datocr", correo);
                startActivity(intent);

            }
        });
    }
}