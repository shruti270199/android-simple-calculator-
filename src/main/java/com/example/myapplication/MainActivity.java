package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.Button1);
        b2=(Button)findViewById(R.id.Button2);
        b3=(Button)findViewById(R.id.Button3);
        b4=(Button)findViewById(R.id.Button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2= new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3= new Intent(MainActivity.this,Main4Activity.class);
                startActivity(i3);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i4= new Intent(MainActivity.this,Main5Activity.class);
                startActivity(i4);

            }
        });

    }
}
