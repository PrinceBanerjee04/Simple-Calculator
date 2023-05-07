package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a,b;

    Button add,sub,mul,div,clr;
    EditText et1,et2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readInput();

                int sum=a+b;

                result.setText(Integer.toString(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readInput();

                int sub=a-b;

                result.setText(Integer.toString(sub));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readInput();
                int mul=a*b;

                result.setText(Integer.toString(mul));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readInput();
                try {
                    int div = a/b;
                    result.setText(Integer.toString(div));
                }catch (Exception e) {
                    result.setText("Can't divide by zero");
                }
                //result.setText(Integer.toString(div));

            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.getText().clear();
                et2.getText().clear();
                result.setText("0");
            }
        });
    }

    void initViews()
    {
        add=findViewById(R.id.btn1);
        sub=findViewById(R.id.btn2);
        mul=findViewById(R.id.btn3);
        div=findViewById(R.id.btn4);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        result=findViewById(R.id.tvResult);
        clr=findViewById(R.id.btnClr);
    }

    void readInput()
    {
        a= Integer.parseInt(et1.getText().toString());
        b= Integer.parseInt(et2.getText().toString());
    }
}