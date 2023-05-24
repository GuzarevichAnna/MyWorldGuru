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

    public Country() {
    }

    public int getCountyID() {
        return countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Image getFlag() {
        return flag;
    }

    public void setFlag(Image flag) {
        this.flag = flag;
    }

    public Image getTerritory() {
        return territory;
    }

    public void setTerritory(Image territory) {
        this.territory = territory;
    }

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
}
