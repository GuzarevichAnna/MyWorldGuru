package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FlagQuiz extends ModePrototype{
    int flagQuizID;
    Image flagImage;
    Country variant1;
    Country variant2;
    Country variant3;
    Country variant4;

    FlagQuiz(int flagQuizID, Image flagImage, Country variant1, Country variant2, Country variant3, Country variant4){
        this.flagQuizID = flagQuizID;
        this.flagImage = flagImage;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.nameOfRegime = "FLAG QUIZ";
    }

}
