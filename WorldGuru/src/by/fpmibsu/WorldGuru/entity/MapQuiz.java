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

    public MapQuiz(int mapQuizID, Country country, String clueFact, int clueArea, int cluePopulation, String clueContinent) {
        this.mapQuizID = mapQuizID;
        this.country = country;
        this.inputTxt = new String();

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

    public int getMapQuizID() {
        return this.mapQuizID;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getClueFact() {
        return this.clueFact;
    }

    public int getClueArea() {
        return this.clueArea;
    }

    public int getCluePopulation() {
        return this.cluePopulation;
    }

    public String getClueContinent() {
        return this.clueContinent;
    }
}
