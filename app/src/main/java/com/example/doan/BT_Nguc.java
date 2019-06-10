package com.example.doan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BT_Nguc extends AppCompatActivity {
    TextView tvNguc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt__nguc);
        tvNguc1 =(TextView)findViewById(R.id.tvNguc1);
        tvNguc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvnguc1 = new Intent(BT_Nguc.this, BT_Nguc2.class);
                startActivity(tvnguc1);
            }
        });
    }
}
