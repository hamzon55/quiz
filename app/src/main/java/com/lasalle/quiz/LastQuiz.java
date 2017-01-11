package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class LastQuiz extends AppCompatActivity {
    int correcto;
   int falso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastquiz);

     TextView text1 =(TextView)findViewById(R.id.text1);

        TextView texto =(TextView)findViewById(R.id.texto);
        Bundle extras = getIntent().getExtras();
        correcto = (Integer) extras.get("param1");
        texto.setText(Integer.toString(correcto));

      falso = (Integer) extras.get("param2");
        text1.setText(Integer.toString(falso));


        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LastQuiz.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    }


