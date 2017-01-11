package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class QuizThree extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizthree);

        final Global app = (Global) getApplicationContext();

        final RadioButton r31 = (RadioButton) findViewById(R.id.r31);
        final RadioButton r32 = (RadioButton) findViewById(R.id.r32);
        final RadioButton r33 = (RadioButton) findViewById(R.id.r33);
        final RadioButton r34 = (RadioButton) findViewById(R.id.r34);


        Button b33 = (Button) findViewById(R.id.b33);
        b33.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
        if (r31.isChecked()) {

app.incrementCorrecto();

            Intent i = new Intent(QuizThree.this, LastQuiz.class);
            startActivity(i);


        } else if (r32.isChecked() || r33.isChecked() || r34.isChecked()) {
app.incrementFalso();
            Intent i = new Intent(QuizThree.this, LastQuiz.class);
            startActivity(i);
        }

    }

});
}
}






