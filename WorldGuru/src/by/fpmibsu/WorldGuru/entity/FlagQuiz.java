package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FlagQuiz extends ModePrototype{
    int flagQuizID;
    int answer;
    Country answerCountry;
    Country firstVariant;
    Country secondVariant;
    Country thirdVariant;
    Country foursVariant;

    public int getFlagQuizID() {
        return flagQuizID;
    }

    public void setFlagQuizID(int flagQuizID) {
        this.flagQuizID = flagQuizID;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public Country getAnswerCountry() {
        return answerCountry;
    }

    public void setAnswerCountry(Country answerCountry) {
        this.answerCountry = answerCountry;
    }

    public Country getFirstVariant() {
        return firstVariant;
    }

    public void setFirstVariant(Country firstVariant) {
        this.firstVariant = firstVariant;
    }

    public Country getSecondVariant() {
        return secondVariant;
    }

    public void setSecondVariant(Country secondVariant) {
        this.secondVariant = secondVariant;
    }

    public Country getThirdVariant() {
        return thirdVariant;
    }

    public void setThirdVariant(Country thirdVariant) {
        this.thirdVariant = thirdVariant;
    }

    public Country getFourthVariant() {
        return foursVariant;
    }

    public void setFourthVariant(Country foursVariant) {
        this.foursVariant = foursVariant;
    }

    public FlagQuiz(int flagQuizID, Country answerCountry, Country firstVariant, Country secondVariant, Country thirdVariant, Country foursVariant) {
        this.flagQuizID = flagQuizID;
        this.answerCountry = answerCountry;

        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.foursVariant = foursVariant;

        if (answerCountry.getID() == firstVariant.getID()) {
            this.answer = firstVariant.getID();
        }
        if (answerCountry.getID() == secondVariant.getID()) {
            this.answer = secondVariant.getID();
        }
        if (answerCountry.getID() == thirdVariant.getID()) {
            this.answer = thirdVariant.getID();
        }
        if (answerCountry.getID() == foursVariant.getID()) {
            this.answer = foursVariant.getID();
        }

        this.nameOfRegime = "FLAG QUIZ";
    }

    public boolean complete() {
        return true;
    }
}