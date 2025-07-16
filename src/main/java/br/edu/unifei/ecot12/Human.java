package br.edu.unifei.ecot12;

import java.util.ArrayList;

public class Human extends Physical {
    private ArrayList<Animal<? extends Element>> bonds = new ArrayList<Animal<? extends Element>>();

    @Override
    public void setBending(BendInterface bending) {
        if (bending == null || bending instanceof HumanBending) {
            super.setBending(bending);
        }
        else {
            System.err.println("This object's type is Human. You should use HumanBending type for it.");
        }
    }

    protected void callsuperSetBending(BendInterface bending) {
        super.setBending(bending);
    }

    public ArrayList<Animal<? extends Element>> getBonds() {
        return this.bonds;
    }

    public void addBond(Animal<? extends Element> animal) {
        this.bonds.add(animal);
        boolean in = false;
        var list = animal.getBonds();
        for (var a : list) {
            if (a == this)
                in = true;
        }
        if (!in)
            list.add(this);
    }
}
