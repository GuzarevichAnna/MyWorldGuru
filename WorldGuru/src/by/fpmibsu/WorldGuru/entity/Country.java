package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class Country {
    int county_ID;
    String name;
    float area;
    int population;
    String continent;
    String fact;
    Image flag;
    Image territory;

    Country(int county_ID, String name, float area, int population, String continent, String fact, Image flag, Image territory) {
        this.county_ID = county_ID;
        this.name = name;
        this.area = area;
        this.population = population;
        this.continent = continent;
        this.fact = fact;
        this.flag = flag;
        this.territory = territory;
    }
}
