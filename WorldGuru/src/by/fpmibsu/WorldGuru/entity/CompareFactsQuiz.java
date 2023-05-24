package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class CompareFactsQuiz extends ModePrototype{
    int compareFactsQuizID;
    String firstQuestion;
    String secondQuestion;
    String thirdQuestion;
    String foursQuestion;

    Country firstVariant;
    Country secondVariant;
    Country thirdVariant;
    Country foursVariant;
    int firstAnswer;
    int secondAnswer;
    int thirdAnswer;
    int foursAnswer;

    public CompareFactsQuiz(int compareFactsQuizID,
                     String firstQuestion, String secondQuestion, String thirdQuestion, String foursQuestion,
                     Country firstVariant, Country secondVariant, Country thirdVariant, Country foursVariant,
                     int firstAnswer, int secondAnswer, int thirdAnswer, int foursAnswer) {
        this.compareFactsQuizID = compareFactsQuizID;
        this.firstQuestion = firstQuestion;
        this.secondQuestion = secondQuestion;
        this.thirdQuestion = thirdQuestion;
        this.foursQuestion = foursQuestion;

        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.foursVariant = foursVariant;

        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.foursAnswer = foursAnswer;

        this.nameOfRegime = "CompareFactsQuiz";
    }

    public boolean complete() {
        return true;
    }

    public String getFirstQuestion() {
        return this.firstQuestion;
    }

    public String getSecondQuestion() {
        return this.secondQuestion;
    }

    public String getThirdQuestion() {
        return this.thirdQuestion;
    }

    public String getFourthQuestion() {
        return this.foursQuestion;
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
        return this.foursVariant;
    }

    public int getFirstAnswer() {
        return this.firstAnswer;
    }

    public int getSecondAnswer() {
        return this.secondAnswer;
    }

    public int getThirdAnswer() {
        return this.thirdAnswer;
    }

    public int getFourthAnswer() {
        return this.foursAnswer;
    }

    public int getCompareFactsQuizID() {
        return this.compareFactsQuizID;
    }
}
