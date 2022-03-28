package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name = "countryes")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nation;
    private String capital;
    private int region;
    private int population;
    private String clime;

    public Country() {
    }

    public Country(String nation, String capital, int region, int population, String clime) {
        this.nation = nation;
        this.capital = capital;
        this.region = region;
        this.population = population;
        this.clime = clime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getClime() {
        return clime;
    }

    public void setClime(String clime) {
        this.clime = clime;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", nation='" + nation + '\'' +
                ", capital='" + capital + '\'' +
                ", region=" + region +
                ", population=" + population +
                ", clime='" + clime + '\'' +
                '}';
    }
}
