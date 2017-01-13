package com.lasalle.quiz.data;

import com.lasalle.quiz.models.Question;

/**
 * Created by hamza on 13/01/2017.
 */

public interface QuestionData {

    public Question getQuestion(int questionId);

    public Integer countQuestions();
}
