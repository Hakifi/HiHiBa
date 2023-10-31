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

public class BelahKetupat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);
        getSupportActionBar().hide();
        EditText inputDiagonal1 = findViewById(R.id.inputDiagonal1);
        EditText inputDiagonal2 = findViewById(R.id.inputDiagonal2);
        EditText inputSisi = findViewById(R.id.inputSisi);
        Button hitung = findViewById(R.id.hitung);
        Button hapus = findViewById(R.id.hapus);
        Button hitung2 = findViewById(R.id.hitung2);
        Button hapus2 = findViewById(R.id.hapus2);

        Button btnBack = findViewById(R.id.back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(BelahKetupat.this, MainActivity.class);
                startActivity(explicit);
            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputDiagonal1.getText().toString().isEmpty()) {
                    inputDiagonal1.setError("Diagonal 1 tidak boleh kosong");
                    return;
                }
                if (inputDiagonal2.getText().toString().isEmpty()) {
                    inputDiagonal2.setError("Diagonal 2 tidak boleh kosong");
                    return;
                }

                double diagonal1 = Double.parseDouble(inputDiagonal1.getText().toString());
                double diagonal2 = Double.parseDouble(inputDiagonal2.getText().toString());
                double hasil = (diagonal1 * diagonal2) / 2;
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText(String.valueOf(hasil));
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDiagonal1.setText("");
                inputDiagonal2.setText("");
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText("");
            }
        });

        hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputSisi.getText().toString().isEmpty()) {
                    inputSisi.setError("Sisi tidak boleh kosong");
                    return;
                }

                double sisi = Double.parseDouble(inputSisi.getText().toString());
                double hasil = 4 * sisi;
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText(String.valueOf(hasil));
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputSisi.setText("");
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText("");
            }
        });
    }

}