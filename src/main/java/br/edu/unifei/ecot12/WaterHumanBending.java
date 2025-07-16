package br.edu.unifei.ecot12;

public class WaterHumanBending extends HumanBending {
    private static Water element = Water.getInstance();

    public WaterHumanBending() {
        MoonSpirit.getInstance().getWaterbenders().add(this);
    }

    private String bendWater() {
        return element.bend(this.getElementMastery());
    }

    private String bendBlood() {
        int mastery = this.getElementMastery();
        if (mastery > 100) {
            return " is bending blood with complete control of the target's body.\n";
        } else if (mastery > 0) {
            return " is bending blood.\n";
        } else {
            return " cannot bend blood effectively.\n";
        }
    }

    @Override
    public void bend(String name) {
        if (this.isSpecialBending()) {
            System.out.println(name + " has blood bending abilities. Which one do you wish to use?\n");
            System.out.println("1. Water\n2. Blood");
            while (true) {
                System.out.println("\nAnswer: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println(name + bendWater());
                        return;
                    case "2":
                        System.out.println(name + bendBlood());
                        return;
                    default:
                        System.err.println("\nType only '1' or '2' to select the bending operation.\n");
                }
            }
        } else {
            System.out.println(name + bendWater());
        }
    }
}
