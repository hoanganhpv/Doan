package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Baitap extends AppCompatActivity {
    Button btnLich, btnVai, btnTay, btnBung, btnNguc ,btnChan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap);
        btnLich=(Button)findViewById(R.id.btn_Lichtap);
        btnLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, LichTap.class);
                startActivity(btnbaitap);
            }
        });
        btnVai=(Button)findViewById(R.id.btn_Vai);
        btnVai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Vai.class);
                startActivity(btnbaitap);
            }
        });
        btnTay =(Button)findViewById(R.id.btn_Tay);
        btnTay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnchuongtrinh = new Intent(Baitap.this, BT_Tay.class);
                startActivity(btnchuongtrinh);
            }
        });

        btnBung= (Button)findViewById(R.id.btn_Bung);
        btnBung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndinhduong =new Intent(Baitap.this, BT_Bung.class);
                startActivity(btndinhduong);
            }

        });

        btnNguc= (Button)findViewById(R.id.btn_Nguc);
        btnNguc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndinhduong =new Intent(Baitap.this, BT_Nguc2.class);
                startActivity(btndinhduong);
            }

        });
        btnChan= (Button)findViewById(R.id.btn_Chan);
        btnChan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndinhduong =new Intent(Baitap.this, BT_Chan.class);
                startActivity(btndinhduong);
            }

        });

    }
}
