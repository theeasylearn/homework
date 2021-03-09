package com.theeasylearn.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class UnitConverter extends AppCompatActivity {

    CheckBox chkfoot,chkmeter,chkkilometer;
    Button btncalculate;
    EditText txtinch;
    TextView lblresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);
        init();
        HandleEvent();
    }

    private void HandleEvent() {

    }

    public void init()
    {
        chkfoot = findViewById(R.id.chkfoot);
        chkmeter = findViewById(R.id.chkmeter);
        chkkilometer = findViewById(R.id.chkkilometer);
        btncalculate = findViewById(R.id.btncalculate);
        txtinch = findViewById(R.id.txtinch);
        lblresult = findViewById(R.id.lblresult);
    }
}
