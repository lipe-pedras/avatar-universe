package br.edu.unifei.ecot12;

public class Air extends Element {
    private static final Air instance = new Air();
    private static String element = "Air";

    private Air() {}

    public static Air getInstance() {
        return instance;
    }

    @Override
    public String getElement() {
        return element;
    }

    @Override
    public String bend(int mastery) {
        if (mastery > 100) {
            return " is bending air into a great tornado.\n";
        } else if (mastery > 0) {
            return " is  bending air .\n";
        } else {
            return " lost his ability as an air bender.\n";
        }
    }
}
