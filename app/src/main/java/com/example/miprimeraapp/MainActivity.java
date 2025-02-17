package com.example.miprimeraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button btnEnviar;
    private TextView txtResultado;
    private ImageView imgRaza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtResultado = findViewById(R.id.txtResultado);
        imgRaza = findViewById(R.id.imgRaza);

        String[] opciones = {"Pinscher y Schnauzer", "Molosos Y Mastines",
                "Perros de Tipo Spitz y Primitivos", "Perros de Pastoreo", "Perros de Compañía"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spinner.setAdapter(adapter);
        imgRaza.setVisibility(View.VISIBLE);
        btnEnviar.setOnClickListener(view -> {
            String seleccion = spinner.getSelectedItem().toString();
            if ("Pinscher y Schnauzer".equals(seleccion)){
                txtResultado.setText("Dobermann\n" +
                        "Pinscher alemán\n" +
                        "Pinscher miniatura\n" +
                        "Schnauzer estándar\n" +
                        "Schnauzer miniatura\n" +
                        "Schnauzer gigante");
                imgRaza.setImageResource(R.drawable.pinscher);
            } else if ("Molosos Y Mastines".equals(seleccion)){
                txtResultado.setText("Mastín español\n" +
                        "Mastín napolitano\n" +
                        "Mastín tibetano\n" +
                        "Dogo argentino\n" +
                        "Dogo de Burdeos\n" +
                        "Bullmastiff");
                imgRaza.setImageResource(R.drawable.moloso);
            } else if ("Perros de Tipo Spitz y Primitivos".equals(seleccion)){
                txtResultado.setText("Husky siberiano\n" +
                        "Alaskan malamute\n" +
                        "Samoyedo\n" +
                        "Chow chow\n" +
                        "Akita inu\n" +
                        "Shiba inu\n" +
                        "Perro lobo checoslovaco");
                imgRaza.setImageResource(R.drawable.spitz);
            } else if ("Perros de Pastoreo".equals(seleccion)){
                txtResultado.setText("Pastor alemán\n" +
                        "Border collie\n" +
                        "Pastor belga malinois\n" +
                        "Pastor suizo blanco\n" +
                        "Collie\n" +
                        "Shetland sheepdog");
                imgRaza.setImageResource(R.drawable.pastor);
            } else {
                txtResultado.setText("Poodle (caniche)\n" +
                        "Chihuahua\n" +
                        "Pug\n" +
                        "Shih tzu\n" +
                        "Bichón frisé\n" +
                        "Cavalier king charles spaniel");
                imgRaza.setImageResource(R.drawable.poodle);
            }

            txtResultado.setVisibility(View.VISIBLE);
            imgRaza.setVisibility(View.VISIBLE);
        });
    }
}
