package br.edu.unifei.ecot12;

public class Nation {
    private String name;
    private String emblem;
    private PoliticalStructure politicalStructure;
    private Locality capital;

    Nation(PoliticalStructure p) {
        this.politicalStructure = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmblem() {
        return emblem;
    }

    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }

    public PoliticalStructure getPoliticalStructure() {
        return politicalStructure;
    }

    public void setPoliticalStructure(PoliticalStructure politicalStructure) {
        this.politicalStructure = politicalStructure;
    }

    public Locality getCapital() {
        return capital;
    }

    public void setCapital(Locality capital) {
        this.capital = capital;
    }

}
