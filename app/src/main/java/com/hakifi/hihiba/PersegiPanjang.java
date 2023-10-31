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

public class PersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        getSupportActionBar().hide();

        Button btnBack = findViewById(R.id.back);
        EditText panjang = findViewById(R.id.inputPanjang);
        EditText lebar = findViewById(R.id.inputLebar);
        Button hitung = findViewById(R.id.hitung);
        Button hapus = findViewById(R.id.hapus);
        EditText panjang2 = findViewById(R.id.inputPanjang2);
        EditText lebar2 = findViewById(R.id.inputLebar2);
        Button hitung2 = findViewById(R.id.hitung2);
        Button hapus2 = findViewById(R.id.hapus2);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (panjang.getText().toString().isEmpty()) {
                    panjang.setError("Panjang tidak boleh kosong");
                    return;
                }

                if (lebar.getText().toString().isEmpty()) {
                    lebar.setError("Lebar tidak boleh kosong");
                    return;
                }

                double p = Double.parseDouble(panjang.getText().toString());
                double l = Double.parseDouble(lebar.getText().toString());
                double luas = p * l;

                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText(String.valueOf(luas));
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang.setText("");
                lebar.setText("");
                TextView hasilLuas = findViewById(R.id.hasilLuas);
                hasilLuas.setText("");
            }
        });

        hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (panjang2.getText().toString().isEmpty()) {
                    panjang2.setError("Panjang tidak boleh kosong");
                    return;
                }

                if (lebar2.getText().toString().isEmpty()) {
                    lebar2.setError("Lebar tidak boleh kosong");
                    return;
                }

                double p = Double.parseDouble(panjang2.getText().toString());
                double l = Double.parseDouble(lebar2.getText().toString());
                double keliling = 2 * (p + l);

                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText(String.valueOf(keliling));
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang2.setText("");
                lebar2.setText("");
                TextView hasilKeliling = findViewById(R.id.hasilKeliling);
                hasilKeliling.setText("");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(PersegiPanjang.this, MainActivity.class);
                startActivity(explicit);
            }
        });

    }
}