package com.example.pelatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvnilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnilai = findViewById(R.id.tvnilai);

        String nilai = getIntent().getStringExtra("hasil");
        tvnilai.setText(nilai);
    }
}
