package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class Country {
    int countyID;
    String name;
    float area;
    int population;
    String continent;
    String fact;
    Image flag;
    Image territory;

    Country(int countyID, String name, float area, int population, String continent, String fact, Image flag, Image territory) {
        this.countyID = countyID;
        this.name = name;
        this.area = area;
        this.population = population;
        this.continent = continent;
        this.fact = fact;
        this.flag = flag;
        this.territory = territory;
    }
}
