package com.hakifi.hihiba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        getSupportActionBar().hide();

        Button btnBack = findViewById(R.id.back);
        Button hasil = findViewById(R.id.hitung);
        Button hapus = findViewById(R.id.hapus);
        Button hasil2 = findViewById(R.id.hitung2);
        Button hapus2 = findViewById(R.id.hapus2);
        EditText sisi = findViewById(R.id.inputSisi);
        EditText sisi2 = findViewById(R.id.inputSisi2);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sisi.getText().toString().isEmpty()) {
                    sisi.setError("Sisi tidak boleh kosong");
                    return;
                }
                double sisi1 = Double.parseDouble(sisi.getText().toString());
                double luas = sisi1 * sisi1;
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText(String.valueOf(luas));
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi.setText("");
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText("");
            }
        });

        hasil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sisi2.getText().toString().isEmpty()) {
                    sisi2.setError("Sisi tidak boleh kosong");
                    return;
                }
                double sisi1 = Double.parseDouble(sisi2.getText().toString());
                double keliling = 4 * sisi1;
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText(String.valueOf(keliling));
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi2.setText("");
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText("");
            }
        });



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(Persegi.this, MainActivity.class);
                startActivity(explicit);
            }
        });

    }
}