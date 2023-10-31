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

public class JajarGenjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);
        getSupportActionBar().hide();

        Button btnBack = findViewById(R.id.back);
        EditText alas = findViewById(R.id.inputAlas);
        EditText tinggi = findViewById(R.id.inputTinggi);
        EditText sisiA = findViewById(R.id.inputSisiA);
        EditText sisiB = findViewById(R.id.inputSisiB);
        Button hitung = findViewById(R.id.hitung);
        Button hapus = findViewById(R.id.hapus);
        Button hitung2 = findViewById(R.id.hitung2);
        Button hapus2 = findViewById(R.id.hapus2);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas.getText().toString().isEmpty()) {
                    alas.setError("Alas tidak boleh kosong");
                    return;
                }

                if (tinggi.getText().toString().isEmpty()) {
                    tinggi.setError("Tinggi tidak boleh kosong");
                    return;
                }

                double a = Double.parseDouble(alas.getText().toString());
                double t = Double.parseDouble(tinggi.getText().toString());
                double luas = a * t;
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText(String.valueOf(luas));
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alas.setText("");
                tinggi.setText("");
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText("0");
            }
        });

        hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sisiA.getText().toString().isEmpty()) {
                    sisiA.setError("Sisi A tidak boleh kosong");
                    return;
                }

                if (sisiB.getText().toString().isEmpty()) {
                    sisiB.setError("Sisi B tidak boleh kosong");
                    return;
                }

                double a = Double.parseDouble(sisiA.getText().toString());
                double b = Double.parseDouble(sisiB.getText().toString());
                double keliling = 2 * (a + b);
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText(String.valueOf(keliling));
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisiA.setText("");
                sisiB.setText("");
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText("0");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(JajarGenjang.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }
}