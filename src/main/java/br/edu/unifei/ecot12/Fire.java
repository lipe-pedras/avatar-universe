package br.edu.unifei.ecot12;

public class Fire extends Element {
    private static String element = "Fire";
    private static final Fire instance = new Fire();

    private Fire() {
    }

    public static Fire getInstance() {
        return instance;
    }

    @Override
    public String getElement() {
        return element;
    }

    @Override
    public String bend(int mastery) {
        if (mastery > 150) {
            return " is bending fire with beatiful rainbow colors.\n";
        } else if (mastery > 80) {
            return " is bending fire with the dragon dance.\n";
        } else if (mastery > 0) {
            return " is bending fire.\n";
        } else {
            return " lost his ability as a fire bender.\n";
        }
    }
}
