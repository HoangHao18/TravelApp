package com.example.travelapp02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DgThaoTac extends Dialog {
    TextView txtSua;
    TextView txtXoa;

    public DgThaoTac(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dg_thao_tac);

        txtSua =  findViewById(R.id.txtSua);
        txtSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        txtXoa =  findViewById(R.id.txtXoa);
        //txtXoa.setOnClickListener();
    }
}