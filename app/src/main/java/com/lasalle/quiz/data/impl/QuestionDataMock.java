package com.lasalle.quiz.data.impl;

import com.lasalle.quiz.data.QuestionData;
import com.lasalle.quiz.models.Answer;
import com.lasalle.quiz.models.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QuestionDataMock implements QuestionData {
    private List<Question> questionList;

    public QuestionDataMock() {

        questionList = new ArrayList<>();
        questionList.add(new Question("Pregunta 1",
                Arrays.asList(
                        new Answer("Respuesta 1", true),
                        new Answer("Respuesta 2", false),
                        new Answer("Respuesta 3", false),
                        new Answer("Respuesta 4", false)

                )));


        questionList.add(new Question("Pregunta 2",
                Arrays.asList(
                        new Answer("Respuesta 1", false),
                        new Answer("Respuesta 2", true),
                        new Answer("Respuesta 3", false),
                        new Answer("Respuesta 4", false)

                )));



        questionList.add(new Question("Pregunta 3",
                Arrays.asList(
                        new Answer("Respuesta 1", false),
                        new Answer("Respuesta 2", true),
                        new Answer("Respuesta 3", false),
                        new Answer("Respuesta 4", false)

                )));
    }


    @Override
    public Question getQuestion(int questionId) {
        return questionList.get(questionId);
    }

    @Override
    public Integer countQuestions() {
        return questionList.size();
    }
}
