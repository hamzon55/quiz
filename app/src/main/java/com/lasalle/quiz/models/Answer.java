package com.lasalle.quiz.models;

/**
 * Created by hamza on 13/01/2017.
 */
public class Answer {


    private  String text;
    private  boolean correct ;

    public Answer(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }




}
