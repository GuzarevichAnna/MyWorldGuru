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

    public Country getAnswerCountry() {
        return this.answerCountry;
    }

    public Country getFirstVariant() {
        return this.firstVariant;
    }

    public Country getSecondVariant() {
        return this.secondVariant;
    }

    public Country getThirdVariant() {
        return this.thirdVariant;
    }

    public Country getFourthVariant() {
        return foursVariant;
    }

    public int getFlagQuizID() {
        return this.flagQuizID;
    }
}