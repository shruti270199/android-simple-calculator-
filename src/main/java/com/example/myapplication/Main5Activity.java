package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    private EditText e41,e42;
    private TextView t41;
    private Button b41;
    int div=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b41=(Button)findViewById(R.id.divbutton);
        e41=(EditText)findViewById(R.id.edit41);
        e42=(EditText)findViewById(R.id.edit42);
        t41=(TextView)findViewById(R.id.text41);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(e41.getText().toString());
                double num2 = Double.parseDouble(e42.getText().toString());
                double div = num1 / num2;
                t41.setText(Double.toString(div));

            }
        });


    }
}
