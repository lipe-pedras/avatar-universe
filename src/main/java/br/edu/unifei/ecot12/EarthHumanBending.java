package br.edu.unifei.ecot12;

public class EarthHumanBending extends HumanBending {
    private static Earth element = Earth.getInstance();

    private String bendEarth() {
        return element.bend(this.getElementMastery());
    }

    private String bendMetal() {
        int mastery = this.getElementMastery();
        if (mastery > 80) {
            return " is bending metal with precision.\n";
        } else if (mastery > 0) {
            return " is bending metal, but with difficulty.\n";
        } else {
            return " lacks the ability to bend metal.\n";
        }
    }

    @Override
    public void bend(String name) {
        if (this.isSpecialBending()) {
            System.out.println(name + " has multiple bending abilities. Which element do you wish to use?");
            System.out.println("1. Earth" + "\n2. Metal");
            while (true) {
                System.out.println("Answer: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println(name + bendEarth());
                        return;
                    case "2":
                        System.out.println(name + bendMetal());
                        return;
                    default:
                        System.err.println("\nType only '1' or '1' to select a bending operation.\n");
                }
            }
        } else {
            System.out.println(name + bendEarth());
        }
    }
}
