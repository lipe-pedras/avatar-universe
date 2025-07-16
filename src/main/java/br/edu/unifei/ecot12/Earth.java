package br.edu.unifei.ecot12;

public class Earth extends Element {
    private static String element = "Earth";
    private static final Earth instance = new Earth();

    private Earth() {}

    public static Earth getInstance() {
        return instance;
    }

    @Override
    public String getElement() {
        return element;
    }

    @Override
    public String bend(int mastery) {
        if (mastery > 100) {
            return " is bengind earth, creating a new island.\n";
        } else if (mastery > 0) {
            return " is bengind earth.\n";
        } else {
            return " lost his ability as an earth bender.\n";
        }
    }
}
