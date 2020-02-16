package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText e1,e2;
    private TextView t1;
    private Button b1;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1=(Button)findViewById(R.id.Sumbutton);
        e1=(EditText)findViewById(R.id.edit1);
        e2=(EditText)findViewById(R.id.edit2);
        t1=(TextView)findViewById(R.id.text1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double sum = num1 + num2;
                t1.setText(Double.toString(sum));

            }
        });


    }
}
