package by.fpmibsu.WorldGuru.entity;
import java.awt.*;

public class MapQuiz extends ModePrototype {
    int mapQuiz;
    Image countryShape;
    String inputTxt;
    String clueArea;
    String clueFact;
    String cluePopulation;
    String clueContinent;

    MapQuiz(int mapQuiz, Image countryShape, String inputTxt, String clueFact, String cluePopulation, String clueContinent, String clueArea){
        this.mapQuiz = mapQuiz;
        this.countryShape = countryShape;
        this.inputTxt = inputTxt;
        this.clueFact = clueFact;
        this.cluePopulation = cluePopulation;
        this.clueArea = clueArea;
        this.clueContinent = clueContinent;
        this.nameOfRegime = "MAP QUIZ";
    }
}
