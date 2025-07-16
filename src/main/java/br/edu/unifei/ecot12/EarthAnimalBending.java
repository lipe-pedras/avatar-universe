package br.edu.unifei.ecot12;

public class EarthAnimalBending extends AnimalBending { 

    private String bendEarth() {
        return " threw a rock!\n";
    }

    @Override
    public void bend(String name) {
        System.out.println(name + bendEarth());
    }
}
