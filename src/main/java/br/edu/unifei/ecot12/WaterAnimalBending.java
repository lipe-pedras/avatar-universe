package br.edu.unifei.ecot12;

public class WaterAnimalBending extends AnimalBending {

    private String bendWater() {
        return " splashed some water.\n";
    }

    @Override
    public void bend(String name) {
        System.out.println(name + bendWater());
        return;
    }
}
