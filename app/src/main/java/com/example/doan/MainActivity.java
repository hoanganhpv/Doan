package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBaiTap, btnBmi, btnDinhDuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBaiTap=(Button)findViewById(R.id.btn_Baitap);
        btnBaiTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbaitap =new Intent(MainActivity.this, Baitap.class);
                startActivity(btnbaitap);
            }
        });
        btnBmi =(Button)findViewById(R.id.btn_BMI);
        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnchuongtrinh = new Intent(MainActivity.this, BMI.class);
                startActivity(btnchuongtrinh);
            }
        });

        btnDinhDuong= (Button)findViewById(R.id.btn_Dinhduong);
        btnDinhDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndinhduong =new Intent(MainActivity.this, Dinhduong.class);
                startActivity(btndinhduong);
            }
        });
    }
}
