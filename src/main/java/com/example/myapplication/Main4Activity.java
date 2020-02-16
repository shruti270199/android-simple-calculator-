package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private EditText e21,e22;
    private TextView t21;
    private Button b21;
    int mul=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b21=(Button)findViewById(R.id.mulbutton);
        e21=(EditText)findViewById(R.id.edit31);
        e22=(EditText)findViewById(R.id.edit32);
        t21=(TextView)findViewById(R.id.text31);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(e21.getText().toString());
                double num2 = Double.parseDouble(e22.getText().toString());
                double mul = num1 * num2;
                t21.setText(Double.toString(mul));

            }
        });


    }
}
