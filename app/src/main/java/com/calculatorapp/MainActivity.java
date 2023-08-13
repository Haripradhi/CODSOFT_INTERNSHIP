package com.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float f1, f2, f;
    Boolean Add, Sub, Multiply, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c = findViewById(R.id.button1);
        Button Bracket = findViewById(R.id.button2);
        Button Percentage = findViewById(R.id.button3);
        Button div = findViewById(R.id.button4);
        Button b7 = findViewById(R.id.button5);
        Button b8 = findViewById(R.id.button6);
        Button b9 = findViewById(R.id.button7);
        Button multiply = findViewById(R.id.button8);
        Button b4 = findViewById(R.id.button9);
        Button b5 = findViewById(R.id.button10);
        Button b6 = findViewById(R.id.button11);
        Button sub = findViewById(R.id.button12);
        Button b1 = findViewById(R.id.button13);
        Button b2 = findViewById(R.id.button14);
        Button b3 = findViewById(R.id.button15);
        Button add = findViewById(R.id.button16);
        Button AC = findViewById(R.id.button17);
        Button b0 = findViewById(R.id.button18);
        Button point = findViewById(R.id.button19);
        Button equal = findViewById(R.id.button20);

        EditText et = findViewById(R.id.editTextNumberDecimal);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "0");

            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + ".");

            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + " ");

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + " ");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(et.getText().toString());
                et.setText(" ");
                Add = true;


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(et.getText().toString());
                et.setText(" ");
                Sub = true;


            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(et.getText().toString());
                et.setText(" ");
                Multiply = true;


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(et.getText().toString());
                et.setText(" ");
                Div = true;


            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add == true) {
                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 + f2;
                    String HP = String.valueOf(f);
                    et.setText(HP);
                    Add = false;
                } else if (Sub == true) {
                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 - f2;
                    String HP = String.valueOf(f);
                    et.setText(HP);
                    Sub = false;
                } else if (Multiply == true) {
                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 * f2;
                    String HP = String.valueOf(f);
                    et.setText(HP);
                    Multiply = false;
                } else if (Div == true) {
                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 / f2;
                    String HP = String.valueOf(f);
                    et.setText(HP);
                    Div = false;
                }

            }
        });
    }
}