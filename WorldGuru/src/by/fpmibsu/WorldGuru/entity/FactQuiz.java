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

    FactQuiz(int factQuizID, String Fact, Country firstVariant, Country secondVariant, Country thirdVariant, Country foursVariant4, int answer){
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
}
