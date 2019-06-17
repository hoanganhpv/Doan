package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Baitap extends AppCompatActivity {
    ImageButton vai,tay,bung,nguc,chan;
    Button btnLich;
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
        vai =(ImageButton)findViewById(R.id.imgVai);
        vai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Vai.class);
                startActivity(btnbaitap);
            }
        });
        tay =(ImageButton)findViewById(R.id.imgTay);
        tay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Tay.class);
                startActivity(btnbaitap);
            }
        });
        bung =(ImageButton)findViewById(R.id.imgBung);
        bung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Bung.class);
                startActivity(btnbaitap);
            }
        });
        nguc =(ImageButton)findViewById(R.id.imgNguc);
        nguc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Nguc2.class);
                startActivity(btnbaitap);
            }
        });
        chan =(ImageButton)findViewById(R.id.imgChan);
        chan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Baitap.this, BT_Chan.class);
                startActivity(btnbaitap);
            }
        });


    }
}
