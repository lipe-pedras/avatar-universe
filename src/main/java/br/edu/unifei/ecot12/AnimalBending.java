package br.edu.unifei.ecot12;

public abstract class AnimalBending implements BendInterface {
    public int getElementMastery() {
        System.out.println("Animals doens't have elemental mastery.\n");
        return 0;
    }

    public void setElementMastery(int v) {
        System.err.println("Animals doesn't have elemental mastery.\n");
    }

    public int[] getElementsMastery() {
        System.out.println("Animals doens't have elemental mastery.\n");
        return null;
    }

    public void setElementsMastery(int[] v) {
        System.out.println("Animals doesn't have elemental mastery.\n");
    }

    @Override
    public boolean isSpecialBending() {
        System.err.println("Only Air Animals have special bending abilities.\n");
        return false;
    }

    @Override
    public void setSpecialBending(boolean v) {
        System.err.println("Only Air Animals have special bending abilities.\n");
        return;
    }
}
