package com.hakifi.hihiba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btnLingkaran = findViewById(R.id.lingkaran);
        Button btnPersegiPanjang = findViewById(R.id.persegiPanjang);
        Button btnPersegi = findViewById(R.id.persegi);
        Button btnSegitiga = findViewById(R.id.segitiga);
        Button btnAboutUs = findViewById(R.id.aboutUs);

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(explicit);
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, PersegiPanjang.class);
                startActivity(explicit);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, Persegi.class);
                startActivity(explicit);
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, Segitiga.class);
                startActivity(explicit);
            }
        });

        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, AboutUs.class);
                startActivity(explicit);
            }
        });

    }
}