package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private EditText e11,e12;
    private TextView t1;
    private Button b11;
    int sub=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b11=(Button)findViewById(R.id.Subbutton);
        e11=(EditText)findViewById(R.id.edit11);
        e12=(EditText)findViewById(R.id.edit12);
        t1=(TextView)findViewById(R.id.text11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(e11.getText().toString());
                double num2 = Double.parseDouble(e12.getText().toString());
                double sub = num1 - num2;
                t1.setText(Double.toString(sub));

            }
        });


    }
}
