package com.example.sumaresta;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText left;
    private EditText right;
    private TextView ans;

    private Button btnUno;
    private Button btnDos;
    private Button btnTres;
    private Button btnCuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSiete;
    private Button btnOcho;
    private Button btnNueve;
    private Button btnCero;

    private Button btnMas;
    private Button btnMenos;

    private int focused = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = findViewById(R.id.left);
        left.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                focused = 1;
                return false;
            }
        });

        right = findViewById(R.id.right);
        right.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                focused = 2;
                return false;
            }
        });

        ans = findViewById(R.id.ans);

        btnUno = findViewById(R.id._1);
        btnDos = findViewById(R.id._2);
        btnTres = findViewById(R.id._3);
        btnCuatro = findViewById(R.id._4);
        btnCinco = findViewById(R.id._5);
        btnSeis = findViewById(R.id._6);
        btnSiete = findViewById(R.id._7);
        btnOcho = findViewById(R.id._8);
        btnNueve = findViewById(R.id._9);
        btnCero = findViewById(R.id._0);

        btnMas = findViewById(R.id._mas);
        btnMenos = findViewById(R.id._menos);

        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnCero.setOnClickListener(this);

        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if( v.getId() == R.id._0 ){
            setNumber("0");
        }
        else if( v.getId() == R.id._1 ){
            setNumber("1");
        }
        else if( v.getId() == R.id._2 ){
            setNumber("2");
        }
        else if( v.getId() == R.id._3 ){
            setNumber("3");
        }
        else if( v.getId() == R.id._4 ){
            setNumber("4");
        }
        else if( v.getId() == R.id._5 ){
            setNumber("5");
        }
        else if( v.getId() == R.id._6 ){
            setNumber("6");
        }
        else if( v.getId() == R.id._7 ){
            setNumber("7");
        }
        else if( v.getId() == R.id._8 ){
            setNumber("8");
        }
        else if( v.getId() == R.id._9 ){
            setNumber("9");
        }

        try{
            Integer number1 = Integer.valueOf(left.getText().toString());
            Integer number2 = Integer.valueOf(right.getText().toString());

            if( v.getId() == R.id._mas ){
                ans.setText(String.valueOf(number1 + number2));
            }
            else if( v.getId() == R.id._menos ){
                ans.setText(String.valueOf(number1 - number2));
            }
        }
        catch (Exception e){

        }

    }

    void setNumber(String number){
        if(focused == 1){
            left.setText(left.getText().toString() + number);
        }
        else if(focused == 2){
            right.setText(right.getText().toString() + number);
        }
    }


}