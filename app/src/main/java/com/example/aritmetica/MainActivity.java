package com.example.aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent viewSumar = new Intent(MainActivity.this, SumarActivity.class);
                startActivity(viewSumar);
            }
        });

        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent viewRestar = new Intent(MainActivity.this, RestarActivity.class);
                startActivity(viewRestar);
            }
        });

        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent viewMultiplicar = new Intent(MainActivity.this, MultiplicarActivity.class);
                startActivity(viewMultiplicar);
            }
        });

        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent viewDividir = new Intent(MainActivity.this, DividirActivity.class);
                startActivity(viewDividir);
            }
        });
    }
}