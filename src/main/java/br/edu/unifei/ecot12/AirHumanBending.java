package br.edu.unifei.ecot12;

public class AirHumanBending extends HumanBending{
    private static Air element = Air.getInstance();

    @Override
    public boolean isSpecialBending() {
        System.err.println("Air Benders doesn't have special bending.");
        return false;
    }

    @Override
    public void setSpecialBending(boolean v) {
        System.err.println("Air Benders doesn't have special bending.");
    }

    @Override
    public void bend(String name) {
        System.out.println(name + element.bend(this.getElementMastery()));
    }
}
