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

    CompareFactsQuiz(int compareFactsQuizID,
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
}
