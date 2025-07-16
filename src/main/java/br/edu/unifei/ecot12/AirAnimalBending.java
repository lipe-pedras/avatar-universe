package br.edu.unifei.ecot12;

public class AirAnimalBending extends AnimalBending {
    private boolean flyer;

    @Override
    public boolean isSpecialBending() {
        return this.flyer;
    }

    @Override
    public void setSpecialBending(boolean v) {
        this.flyer = v;
    }

    private String fly() {
        return " is flying!\n";
    }

    private String bendAir() {
        return " threw a vortex of air.\n";
    }

    @Override
    public void bend(String name) {
        System.out.println(name + " is able to fly! Do you whish for it to fly or bend air?\n" +
                "1. Fly\n2. Bend air\nAnswer: ");
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(name + this.fly());
                    return;
                case "2":
                    System.out.println(name + this.bendAir());
                    return;
                default:
                    System.out.println("\nAnswer only with 1 or 2! ");

            }
        }
    }

}
