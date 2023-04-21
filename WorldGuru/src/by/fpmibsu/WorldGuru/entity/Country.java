package by.fpmibsu.WorldGuru.entity;

public class Country {
    String name;
    float area;
    int population;
    String continent;
    String fact;

    Country(String name, float area, int population, String continent, String fact) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.continent = continent;
        this.fact = fact;
    }
}
