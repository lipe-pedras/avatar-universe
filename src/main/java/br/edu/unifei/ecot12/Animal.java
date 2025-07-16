package br.edu.unifei.ecot12;

import java.util.ArrayList;

public class Animal<T extends Element> extends Physical {
    private T element;
    private String species;
    private ArrayList<Human> bonds = new ArrayList<Human>();

    Animal(T element) {
        this.element = element;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public ArrayList<Human> getBonds() {
        return this.bonds;
    }

    public void addBonds(Human human) {
        this.bonds.add(human);
        var list = human.getBonds();
        boolean in = false;
        for (var h : list) {
            if (h == this)
                in = true;
        }
        if (!in)
            list.add(this);
    }

    @Override
    public void setBending(BendInterface bend) {
        if (bend == null)
            super.setBending(null);
        else if (element instanceof Air) {
            if (bend instanceof AirAnimalBending) {
                super.setBending(bend);
            } else
                System.err.println(
                        "This entity is an Animal<Air>, therefore it can only set AirAnimalBending type object as it's bending.");
        } else if (element instanceof Fire) {
            if (bend instanceof FireAnimalBending) {
                super.setBending(bend);
            } else
                System.err.println(
                        "This entity is an Animal<Fire>, therefore it can only set FireAnimalBending type object as it's bending.");
        } else if (element instanceof Earth) {
            if (bend instanceof EarthAnimalBending) {
                super.setBending(bend);
            } else
                System.err.println(
                        "This entity is an Animal<Earth>, therefore it can only set EarthAnimalBending type object as it's bending.");
        } else if (element instanceof Water) {
            if (bend instanceof WaterAnimalBending) {
                super.setBending(bend);
            } else
                System.err.println(
                        "This entity is an Animal<Water>, therefore it can only set WaterAnimalBending type object as it's bending.");
        }
    }

}
