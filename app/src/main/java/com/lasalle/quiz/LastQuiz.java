package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class LastQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastquiz);
        final Global app = (Global) getApplicationContext();

        TextView rest =(TextView)findViewById(R.id.textresult);

        TextView text1 =(TextView)findViewById(R.id.text1);
        TextView texto =(TextView)findViewById(R.id.texto);
        int correcto = app.getCorrecto();
        int falso = app.getFalso();
        int total = app.getTotal();

        texto.setText(Integer.toString(correcto));
        text1.setText(Integer.toString(falso));
        rest.setText(Integer.toString(total));


        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LastQuiz.this, MainActivity.class);

                startActivity(intent);

            }
        });

    }

    }


