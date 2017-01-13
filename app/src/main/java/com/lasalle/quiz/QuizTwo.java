package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class QuizTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiztwo);

        final Global app = (Global) getApplicationContext();

        final RadioButton r12 = (RadioButton) findViewById(R.id.r12);
        final RadioButton r22 = (RadioButton) findViewById(R.id.r22);
        final RadioButton r32 = (RadioButton) findViewById(R.id.r32);
        final RadioButton r42 = (RadioButton) findViewById(R.id.r42);

        Button b22 = (Button) findViewById(R.id.b33);
        b22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (r12.isChecked()) {
                    app.incrementCorrecto();
                    Intent i = new Intent(QuizTwo.this, Result.class);
                    startActivity(i);


                } else if (r22.isChecked() || r32.isChecked() || r42.isChecked()) {
                    app.incrementFalso();
                    Intent i = new Intent(QuizTwo.this, Result.class);
                    startActivity(i);
                }
                app.incrementtotal();

            }

        });
    }
}






