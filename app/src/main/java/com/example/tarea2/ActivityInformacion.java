package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {

    TextView tvnombre, tvapellido, tvedad, tvcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        tvnombre =(TextView) findViewById(R.id.tvnombre);
        tvapellido=(TextView)findViewById(R.id.tvapellidos);
        tvedad=(TextView)findViewById(R.id.tvedad);
        tvcorreo=(TextView)findViewById(R.id.tvcorreo) ;


        String datonm = getIntent().getStringExtra("datonm");
        tvnombre.setText("Nombre: "+datonm);

        String datoap = getIntent().getStringExtra("datoap");
        tvapellido.setText("Apellido: "+datoap);

        String datoed = getIntent().getStringExtra("datoed");
        tvedad.setText("Edad: "+datoed);

        String datocr = getIntent().getStringExtra("datocr");
        tvcorreo.setText("Correo: "+datocr);
    }
}