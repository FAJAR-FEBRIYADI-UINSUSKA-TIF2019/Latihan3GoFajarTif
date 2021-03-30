package com.tugas3.gofajartif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //Gambar Rumah Sakit

        Intent intent = new Intent(this, RS.class);
        startActivity(intent);

    }
}