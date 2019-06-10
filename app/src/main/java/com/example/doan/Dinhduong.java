package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dinhduong extends AppCompatActivity {
    Button btntangcan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinhduong);
        btntangcan=(Button)findViewById(R.id.btn_tang);
        btntangcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(Dinhduong.this, Tangcan.class);
                startActivity(btnbaitap);
            }
        });
    }
}
