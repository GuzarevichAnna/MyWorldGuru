package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class Country implements Comparable {
    int countyID;
    String name;
    float area;
    int population;
    String continent;
    String fact;
    Image flag;
    Image territory;

    public Country(int countyID, String name, float area, int population, String continent, String fact, Image flag, Image territory) {
        this.countyID = countyID;
        this.name = name;
        this.area = area;
        this.population = population;
        this.continent = continent;
        this.fact = fact;
        this.flag = flag;
        this.territory = territory;
    }

    public int getID() {
        return this.countyID;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        if (this.getID() == ((Country)o).getID()) {
            return 1;
        }
        else return -1;
    }

    public float getArea() {
        return this.area;
    }

    public int getPopulation() {
        return this.population;
    }

    public String getContinent() {
        return this.continent;
    }

    public String getFact() {
        return this.fact;
    }

    public Image getFlag() {
        return this.flag;
    }

    public Image getTerritory() {
        return this.territory;
    }
}
