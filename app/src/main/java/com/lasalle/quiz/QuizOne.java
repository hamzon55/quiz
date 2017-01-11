package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class QuizOne extends AppCompatActivity {

    int correcto =0;
    int falso =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizone);


        final RadioButton r1 = (RadioButton)findViewById(R.id.r1);
        final RadioButton r2 = (RadioButton)findViewById(R.id.r2);

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
              if (r1.isChecked()) {
                    correcto++;
                    falso=0;
                    Intent i=new Intent(QuizOne.this,LastQuiz.class);
                    i.putExtra("param1",correcto);
                  i.putExtra("param2",falso);

                  startActivity(i);
             }
              else if (r2.isChecked()){
                    correcto=0;
                    falso++;
                  Intent i=new Intent(QuizOne.this,LastQuiz.class);
                  i.putExtra("param1",correcto);
                  i.putExtra("param2",falso);
                  startActivity(i);
                }

            }

        });
    }

    }


