package com.hakifi.hihiba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity {

    ImageView imgKipli;
    ImageView imgHaff;
    ImageView imgKimi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();

        Button btnBack = findViewById(R.id.back);
        imgKipli = (ImageView) findViewById(R.id.kipliIG);
        imgHaff = (ImageView) findViewById(R.id.haffIG);
        imgKimi = (ImageView) findViewById(R.id.kimiIG);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(AboutUs.this, MainActivity.class);
                startActivity(explicit);
            }
        });

        imgKipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/erxyon/"));
                startActivity(implicit);
            }
        });

        imgHaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hafidzmrizky/"));
                startActivity(implicit);
            }
        });

        imgKimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/kimiginting/"));
                startActivity(implicit);
            }
        });

    }
}