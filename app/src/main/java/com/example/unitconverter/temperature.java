package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        TextView textview2 = (TextView) findViewById(R.id.textview2);
        TextView textview3 = (TextView) findViewById(R.id.textview3);
        TextView editTextTextPersonName4 = (TextView) findViewById(R.id.editTextTextPersonName4);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Converter Worked",Toast.LENGTH_SHORT).show();
                String s = editTextTextPersonName4.getText().toString();
                int celsius = Integer.parseInt(s);
                double fahrenheit = (celsius * 9/5) + 32;
                textview3.setText("The corresponding value in fahrenheit is " + fahrenheit);
            }
        });
    }
}