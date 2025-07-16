package br.edu.unifei.ecot12;

public class FireAnimalBending extends AnimalBending {

    private String bendFire() {
        return " spit a fireball.\n";
    }

    @Override
    public void bend(String name) {
        System.out.println(name + bendFire());
        return;
    }
}
