package com.example.applicationkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama; angka_kedua;
    button tambah, kurang, kali,bagi,bersihkan;
    TextView hasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    angka_pertama = (EditText) findViewById(R.id.angka_pertama);
    angka_kedua = (EditText) findViewById(R.id.angka_kedua);
    tambah =
    }
}