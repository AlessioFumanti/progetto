package com.example.datamanager3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtTitolo;
    GestioneBrani gb;
    Button btnAggiungi = (Button)findViewById(R.id.button);
    Button btnVisualizza = (Button)findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb = new GestioneBrani();
        btnAggiungi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }


        });


    }
}