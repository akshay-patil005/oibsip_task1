package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button CM;
    Button m;
    Button M;
    Button KM;
    Button G;
    Button KG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output =findViewById(R.id.output);
        EnterNum =findViewById(R.id.editTextNumberDecimal);
        CM =findViewById(R.id.button5);
        m =findViewById(R.id.button6);
        M =findViewById(R.id.button9);
        KM =findViewById(R.id.button10);
        G =findViewById(R.id.button7);
        KG =findViewById(R.id.button8);

        CM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float CM=(number*100);
                output.setText("value from m to cm: " + CM);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float m=(number/100);
                output.setText("value from cm to m: " + m);
            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float M=(number*1000);
                output.setText("value from km to m: " +M);
            }
        });
        KM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float KM=(number/1000);
                output.setText("value from m to km: "+KM);
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float G=(number*1000);
                output.setText("value from kg to g: "+G);
            }
        });
        KG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= EnterNum.getText().toString();
                int number=Integer.parseInt(num);
                float KG=(number/1000);
                output.setText("value from g to kg: "+KG);
            }
        });

    }
}