package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FactQuiz extends ModePrototype{
    int factQuizID;
    int answer;
    String Fact;
    Country firstVariant;
    Country secondVariant;
    Country thirdVariant;
    Country foursVariant;

    public FactQuiz(int factQuizID, String Fact, Country firstVariant, Country secondVariant, Country thirdVariant, Country foursVariant, int answer){
        this.factQuizID = factQuizID;
        this.Fact = Fact;
        this.answer = answer;

        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.foursVariant = foursVariant;

        this.nameOfRegime = "FACT QUIZ";
    }

    public boolean complete() {
        return true;
    }

    public String getFact() {
        return this.Fact;
    }

    public int getAnswer() {
        return this.answer;
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

    public int getFactQuizID() {
        return factQuizID;
    }
}
