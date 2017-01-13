package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class QuizOne extends AppCompatActivity  {


    private List<RadioButton> radioButtonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizone);

        final Global gs = (Global) getApplication();


        radioButtonList=new ArrayList<>();
        radioButtonList.add((RadioButton) findViewById(R.id.r1));
        radioButtonList.add((RadioButton) findViewById(R.id.r2));
        radioButtonList.add((RadioButton) findViewById(R.id.r3));
        radioButtonList.add((RadioButton) findViewById(R.id.r4));



        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TestQuiz();
                gs.incrementtotal();
            }

            private void TestQuiz() {
                if (r1.isChecked()) {
                    gs.incrementCorrecto();
                      Intent i=new Intent(QuizOne.this,QuizTwo.class);
                    startActivity(i);
               }
                else if (r2.isChecked()|| r3.isChecked()|| r4.isChecked()){
                    gs.incrementFalso();
                    Intent i=new Intent(QuizOne.this,QuizTwo.class);
                    startActivity(i);
                  }
            }

        });
    }

    }


