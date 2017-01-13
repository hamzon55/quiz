package com.lasalle.quiz;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.lasalle.quiz.data.QuestionData;
import com.lasalle.quiz.data.impl.QuestionDataMock;
import com.lasalle.quiz.models.Answer;
import com.lasalle.quiz.models.Question;

import java.util.ArrayList;
import java.util.List;


public class QuizOne extends AppCompatActivity implements View.OnClickListener{


    private int currentQuestion =0;
    private QuestionData questionData;
    private List<RadioButton> radioButtonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizone);

        questionData = new QuestionDataMock();
        final Global gs = (Global) getApplication();
        Button b2 = (Button) findViewById(R.id.b2);


        radioButtonList = new ArrayList<>();
        radioButtonList.add((RadioButton) findViewById(R.id.r1));
        radioButtonList.add((RadioButton) findViewById(R.id.r2));
        radioButtonList.add((RadioButton) findViewById(R.id.r3));
        radioButtonList.add((RadioButton) findViewById(R.id.r4));


        formatTitle();
        formatQuestion();


//        b2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                if (r1.isChecked()) {
//                    gs.incrementCorrecto();
//                    Intent i = new Intent(QuizOne.this, QuizTwo.class);
//                    startActivity(i);
//
//
//                } else if (r2.isChecked() || r3.isChecked() || r4.isChecked()) {
//                    gs.incrementFalso();
//                    Intent i = new Intent(QuizOne.this, QuizTwo.class);
//                    startActivity(i);
//                }
//                gs.incrementtotal();

//            }

//        });
//    }
//}


    }
    @Override
    public void onClick(View v) {

    }
        private void formatTitle() {
            Resources res = getResources();
            String text = String.format(
                    res.getString(R.string.current_question),
                    currentQuestion + 1,
                    questionData.countQuestions());
            TextView textView = (TextView) findViewById(R.id.questionBreadcrumb);
            textView.setText(text);
        }

    private void formatQuestion() {
        Question question = questionData.getQuestion(0);

        TextView textView = (TextView) findViewById(R.id.questionTitle);
        textView.setText(question.getText());

        int answerIndex = 0;
        for(Answer answer : question.getAnswerList())
        {
            radioButtonList.get(answerIndex).setText(answer.getText());
            ++answerIndex;
        }
    }



    }






