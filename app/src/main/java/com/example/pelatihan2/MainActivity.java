package com.example.pelatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText panjang, lebar,tinggi;
    private Button volume,count,pindahlayout;
    private TextView tvhasil,tvcount;
    private int jumlah =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        tinggi = findViewById(R.id.tinggi);
        volume = findViewById(R.id.volume);
        tvhasil = findViewById(R.id.tvhasil);
        tvcount = findViewById(R.id.tvcount);
        count = findViewById(R.id.count);
        pindahlayout = findViewById(R.id.pindahlayout);

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spanjang = panjang.getText().toString();
                String slebar = lebar.getText().toString();
                String stinggi = tinggi.getText().toString();

                double panjang = Double.parseDouble(spanjang);
                double lebar = Double.parseDouble(slebar);
                double tinggi = Double.parseDouble(stinggi);

                double hasil = panjang*lebar*tinggi;

                String shasil = String.valueOf(hasil);
                tvhasil.setText(shasil);

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("hasil", shasil);
                startActivity(intent);


            }
        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlah ++;
                if (tvcount!=null)
                    tvcount.setText(Integer.toString(jumlah));

            }
        });

        pindahlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);

            }
        });
    }

}
