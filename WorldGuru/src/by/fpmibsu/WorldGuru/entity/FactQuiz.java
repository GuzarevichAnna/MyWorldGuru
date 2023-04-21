package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FactQuiz extends ModePrototype{
    String Fact;

    Country variant1;
    Country variant2;
    Country variant3;
    Country variant4;

    FactQuiz(String Fact, Country variant1, Country variant2, Country variant3, Country variant4){
        this.Fact = Fact;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.nameOfRegime = "FACT QUIZ";
    }
}
