package com.lasalle.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Result extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastquiz);
        final Global app = (Global) getApplicationContext();

        TextView rest = (TextView) findViewById(R.id.textresult);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView texto = (TextView) findViewById(R.id.texto);


        texto.setText(Integer.toString(app.getCorrecto()));
        text1.setText(Integer.toString(app.getFalso()));
        rest.setText(Integer.toString(app.getTotal()));


        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, MainActivity.class);

                startActivity(intent);

            }
        });

    }

}


