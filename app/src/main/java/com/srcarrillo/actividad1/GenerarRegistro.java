package com.srcarrillo.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GenerarRegistro extends AppCompatActivity {
    private EditText etNombre, etCorreo, etLenguaje;
    private TextView txtNombre, txtCorreo, txtRating, txtRating2, txtExp, txtAños;
    private RadioGroup rgAños;
    private RadioButton rbSi, rbNo;
    private RatingBar rbAños;
    private Button btnRegistrarse;
    private ArrayList Datos, Nombres;
    private String ValorRg, Intereses;
    private CheckBox cbPython, cbJava, cbC, cbHtml, cbOtro;
    static ArrayList<Persona> ListaPersonas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_registro);

        txtRating = findViewById(R.id.txtRating);
        txtRating2 = findViewById(R.id.txtRating2);
        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        rgAños = findViewById(R.id.rgAños);
        rbAños = findViewById(R.id.rbAños);
        rbSi = findViewById(R.id.rbSi);
        rbNo = findViewById(R.id.rbNo);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        cbC = findViewById(R.id.cbC);
        cbHtml = findViewById(R.id.cbHtml);
        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbOtro = findViewById(R.id.cbOtro);
        etLenguaje = findViewById(R.id.etLenguaje);
        ValorRg = "No";
        Intereses = "";


        rbAños.setEnabled(false);

        //rbAños.setVisibility(View.GONE);
        //txtRating.setVisibility(View.GONE);
        //txtRating2.setVisibility(View.GONE);


        rgAños.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSi) {
                    rbAños.setEnabled(true);
                    //rbAños.setVisibility(View.VISIBLE);
                    //txtRating.setVisibility(View.VISIBLE);
                    //txtRating2.setVisibility(View.VISIBLE);
                    ValorRg = "Si";


                } else {
                    //rbAños.setVisibility(View.GONE);
                    //txtRating.setVisibility(View.GONE);
                    //txtRating2.setVisibility(View.GONE);
                    rbAños.setEnabled(false);
                    rbAños.setRating(0);
                    ValorRg = "No";
                }
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GenerarRegistro.this, "Listo", Toast.LENGTH_LONG).show();
                String Nombre = etNombre.getText().toString();
                String Correo = etCorreo.getText().toString();
                String Exp = ValorRg;
                String Años = "";
                if (Exp == "Si") {
                    Años = String.valueOf(rbAños.getNumStars());
                } else {
                    Años = "0";
                }

                String Intereses = "";
                if (cbPython.isChecked()) {
                    Intereses = Intereses + "Python  ";
                }
                if (cbJava.isChecked()) {
                    Intereses = Intereses + "Java  ";
                }
                if (cbC.isChecked()) {
                    Intereses = Intereses + "C#  ";
                }
                if (cbHtml.isChecked()) {
                    Intereses = Intereses + "HTML  ";
                }
                if (cbOtro.isChecked()) {
                    Intereses = Intereses + etLenguaje.getText().toString();
                }
                Persona NPersona = new Persona(Nombre, Correo, Exp, Años, Intereses);
                ListaPersonas.add(NPersona);

            }
        });


    }
}