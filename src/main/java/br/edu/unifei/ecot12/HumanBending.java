package br.edu.unifei.ecot12;

public abstract class HumanBending implements BendInterface {
    private int elementMastery;
    private boolean specialBending;

    public int getElementMastery() {
        return elementMastery;
    }

    public void setElementMastery(int v) {
        this.elementMastery = v;
    }

    public int[] getElementsMastery() {
        System.err.println("This entity is a Human bender, you should use the method getElementMastery().\n");
        return null;
    }

    public void setElementsMastery(int[] v) {
        System.err.println("This entity is a Human bender, you should use the method setElementMastery().\n");
    }

    @Override
    public boolean isSpecialBending() {
        return this.specialBending;
    }

    @Override
    public void setSpecialBending(boolean v) {
        this.specialBending = v;
    }
}
