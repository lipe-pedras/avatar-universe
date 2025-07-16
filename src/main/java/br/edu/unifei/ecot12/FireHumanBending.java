package br.edu.unifei.ecot12;

public class FireHumanBending extends HumanBending {
    private static Fire element = Fire.getInstance();

    FireHumanBending() {
        SozinComet.getInstance().getFirebenders().add(this);
    }

    private String bendFire() {
        return element.bend(this.getElementMastery());
    }

    private String bendLightning() {
        int mastery = this.getElementMastery();
        if (mastery > 100) {
            return " is bending lightning with full flow.\n";
        } else if (mastery > 0) {
            return " is bending lightning.\n";
        } else {
            return " lost his ability as a lightning bender.\n";
        }
    }

    @Override
    public void bend(String name) {
        if (this.isSpecialBending()) {
            System.out.println(
                    name + " is also a lightning bender. Which element do you wish to use?\n1. Fire\n2. Lightning");
            while (true) {
                System.out.println("Answer: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println(name + bendFire());
                        return;
                    case "2":
                        System.out.println(name + bendLightning());
                        return;
                    default:
                        System.err.println("\nType only '1' or '2' for selecting the bend operation.\n");
                }
            }
        } else
            System.out.println(name + bendFire());
        return;
    }
}
