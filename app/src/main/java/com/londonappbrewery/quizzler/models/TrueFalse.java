package com.londonappbrewery.quizzler.models;

/**
 * Created by aluno on 23/05/19.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionID, boolean trueOrFalse){
        this.mQuestionID = questionID;
        this.mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return this.mQuestionID;
    }

    public void setQuestionID(int questionID) {
        this.mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return this.mAnswer;
    }
}
