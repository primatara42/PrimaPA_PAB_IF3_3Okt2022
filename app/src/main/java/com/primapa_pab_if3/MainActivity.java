package com.primapa_pab_if3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    Button btnPindah;
    EditText etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Layout A");

        btnPindah = findViewById(R.id.btn_pindah);
        etNama = findViewById(R.id.et_nama);


        btnPindah.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String nama = etNama.getText().toString();

                if(nama.equals(""))
                {
                    etNama.setError("Nama Harus Diisi!");
                }

                else
                {
                    Intent pindahlayout = new Intent(MainActivity.this, SecondActivity.class);
                    pindahlayout.putExtra("xNama", nama);
                    startActivity(pindahlayout);
                }



            }

        });



    }
}