package com.utsc.buttonwlistner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtxt1, edtxt2;
    private Button badd, bsub, bmultiply, bdivide;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
        // Hide TitleBar
        //getSupportActionBar().hide();
        // Full Screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);


    }

    private void addListnerOnButton() {
        edtxt1 = (EditText) findViewById(R.id.edttxt1);
        edtxt2 = findViewById(R.id.edttxt2);
        badd = findViewById(R.id.button);
        bsub = findViewById(R.id.button1);
        bmultiply = findViewById(R.id.button3);
        bdivide = findViewById(R.id.button4);
        textView = findViewById(R.id.txt);


        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtxt1.getText().toString());
                int b = Integer.parseInt(edtxt2.getText().toString());
                textView.setText(String.valueOf(a+b));
                //Toast.makeText(getApplicationContext(), String.valueOf(a+b), Toast.LENGTH_LONG).show();
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtxt1.getText().toString());
                int b = Integer.parseInt(edtxt2.getText().toString());
                textView.setText(String.valueOf(a-b));
            }
        });
        bmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtxt1.getText().toString());
                int b = Integer.parseInt(edtxt2.getText().toString());
                textView.setText(String.valueOf(a*b));
                //Toast.makeText(getApplicationContext(), String.valueOf(a*b), Toast.LENGTH_LONG).show();
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtxt1.getText().toString());
                int b = Integer.parseInt(edtxt2.getText().toString());
                int divide;
                try {
                    divide = a/b;
                    textView.setText(String.valueOf(divide));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Invalid ", Toast.LENGTH_SHORT).show();
                }

                //Toast.makeText(getApplicationContext(), String.valueOf(a/b), Toast.LENGTH_LONG).show();
            }
        });
    }

}