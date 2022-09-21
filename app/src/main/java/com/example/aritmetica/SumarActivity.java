package com.example.aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SumarActivity extends AppCompatActivity
{
    private EditText tfN1;
    private EditText tfN2;
    private TextView lblResultado;
    private Button   btnCalcular;
    private Button   btnLimpiar;
    private Button   btnMenu;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        tfN1 = (EditText)findViewById(R.id.tfN1);
        tfN2 = (EditText)findViewById(R.id.tfN2);

        lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                int n1 = Integer.parseInt(tfN1.getText().toString());
                int n2 = Integer.parseInt(tfN2.getText().toString());

                int suma = n1 + n2;

                lblResultado.setText(String.valueOf(suma));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfN1.setText("");
                tfN2.setText("");
                lblResultado.setText("");
            }
        });

        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfN1.setText("");
                tfN2.setText("");
                lblResultado.setText("");

                Intent viewMenu = new Intent(SumarActivity.this, MainActivity.class);
                startActivity(viewMenu);
            }
        });
    }
}
