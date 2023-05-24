package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FactQuiz extends ModePrototype{
    int factQuizID;
    int answer;
    String Fact;
    Country firstVariant;
    Country secondVariant;
    Country thirdVariant;
    Country foursVariant4;

    public FactQuiz(int factQuizID, String Fact, Country firstVariant, Country secondVariant, Country thirdVariant, Country foursVariant4, int answer){
        this.factQuizID = factQuizID;
        this.Fact = Fact;
        this.answer = answer;

        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.foursVariant4 = foursVariant4;

        this.nameOfRegime = "FACT QUIZ";
    }

    public boolean complete() {
        return true;
    }

    public int getFactQuizID() {
        return factQuizID;
    }

    public void setFactQuizID(int factQuizID) {
        this.factQuizID = factQuizID;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getFact() {
        return Fact;
    }

    public void setFact(String fact) {
        Fact = fact;
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
        return foursVariant4;
    }

    public void setFourthVariant(Country foursVariant4) {
        this.foursVariant4 = foursVariant4;
    }
}
