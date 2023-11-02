package com.hakifi.hihiba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    Button hitung2, hapus2, hitung, hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        getSupportActionBar().hide();

        Button btnBack = findViewById(R.id.back);
        Button hitung2 = findViewById(R.id.hitung2);
        Button hapus2 = findViewById(R.id.hapus2);
        Button hitung = findViewById(R.id.hitung);
        Button hapus = findViewById(R.id.hapus);
        EditText diameter = findViewById(R.id.inputDiameter);
        EditText jarijari = findViewById(R.id.inputJari);
        EditText diameter2 = findViewById(R.id.inputDiameter2);
        EditText jarijari2 = findViewById(R.id.inputJari2);


        diameter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                jarijari.setEnabled(charSequence.length() <= 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        jarijari.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                diameter.setEnabled(charSequence.length() <= 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        diameter2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                jarijari2.setEnabled(charSequence.length() <= 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        jarijari2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                diameter2.setEnabled(charSequence.length() <= 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(Lingkaran.this, MainActivity.class);
                startActivity(explicit);
            }
        });

        hitung2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                kelilingLingkaran();
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText diameter = findViewById(R.id.inputDiameter2);
                EditText jarijari = findViewById(R.id.inputJari2);
                hapusLingkaran(diameter, jarijari);
            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                luasLingkaran();
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText diameter = findViewById(R.id.inputDiameter);
                EditText jarijari = findViewById(R.id.inputJari);
                hapusLingkaran(diameter, jarijari);
            }
        });
    }

    public void kelilingLingkaran() {
        EditText diameter = findViewById(R.id.inputDiameter2);
        EditText jarijari = findViewById(R.id.inputJari2);
        double dia, jari;
        dia= 0;
        jari = 0;

        if (diameter.getText().toString().isEmpty()) {
            if (!jarijari.getText().toString().isEmpty()) {
                jari = Double.parseDouble(jarijari.getText().toString());
                dia = jari * 2;
            }
        } else {
            if (!diameter.getText().toString().isEmpty()) {
                dia = Double.parseDouble(diameter.getText().toString());
            }
        }

        if (dia == 0) {
            diameter.setError("Diameter tidak boleh kosong");
            return;
        }

        if (jari == 0) {
            jari = dia / 2;
        }

        double keliling = Math.PI * dia;
        TextView hasilLingkaran = findViewById(R.id.hasilKeliling);
        hasilLingkaran.setText("" + keliling);
        return;
    }

    public void luasLingkaran() {
        EditText diameter = findViewById(R.id.inputDiameter);
        EditText jarijari = findViewById(R.id.inputJari);
        double dia, jari;
        dia= 0;
        jari = 0;

        if (diameter.getText().toString().isEmpty()) {
            if (!jarijari.getText().toString().isEmpty()) {
                jari = Double.parseDouble(jarijari.getText().toString());
                dia = jari * 2;
            }
        } else {
            if (!diameter.getText().toString().isEmpty()) {
                dia = Double.parseDouble(diameter.getText().toString());
            }
        }

        if (dia == 0) {
            diameter.setError("Diameter tidak boleh kosong");
            return;
        }

        if (jari == 0) {
            jari = dia / 2;
        }

        double luas = Math.PI * jari * jari;
        TextView hasilLingkaran = findViewById(R.id.hasilLuas);
        hasilLingkaran.setText("" + luas);
        return;
    }

    public void hapusLingkaran(EditText diameter, EditText jarijari) {
        diameter.setText("");
        jarijari.setText("");
        TextView hasilLingkaran = findViewById(R.id.hasilKeliling);
        TextView hasilLuas = findViewById(R.id.hasilLuas);
        hasilLingkaran.setText("");
        hasilLuas.setText("");
        return;
    }

}