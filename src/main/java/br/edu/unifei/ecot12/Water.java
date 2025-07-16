package br.edu.unifei.ecot12;

public class Water extends Element {
    private static String element = "Water";
    private static final Water instance = new Water();

    private Water() {}

    public static Water getInstance() {
        return instance;
    }
    @Override
    public String getElement() {
        return element;
    }

    @Override
    public String bend(int mastery) {
        if (mastery > 100) {
            return " is bending water into a Tsunami.\n";
        } else if (mastery > 0) {
            return " is bending water.\n";
        } else {
            return " lost his ability as a water bender.\n";
        }
    }
}
