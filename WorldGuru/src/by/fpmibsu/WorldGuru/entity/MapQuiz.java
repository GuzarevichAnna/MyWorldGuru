package by.fpmibsu.WorldGuru.entity;
import java.awt.*;

public class MapQuiz extends ModePrototype {
    int mapQuizID;
    Country country;
    String inputTxt;
    String clueFact;
    int clueArea;
    int cluePopulation;
    String clueContinent;

    MapQuiz(int mapQuizID, Country country, String inputTxt, String clueFact, int clueArea, int cluePopulation, String clueContinent) {
        this.mapQuizID = mapQuizID;
        this.country = country;
        this.inputTxt = inputTxt;

        this.clueFact = clueFact;
        this.clueArea = clueArea;
        this.cluePopulation = cluePopulation;
        this.clueContinent = clueContinent;

        this.nameOfRegime = "MAP QUIZ";
    }

    public boolean complete() {
        if (country.getName().compareTo(inputTxt) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
