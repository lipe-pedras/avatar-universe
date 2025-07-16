package br.edu.unifei.ecot12;

public class Vaatu extends GreatSpirit {
    private static final Vaatu instance = new Vaatu();
    private RaavaAndVaatuMediator mediator = RaavaAndVaatuMediator.getInstance();

    private Vaatu() {
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
        mediator.balance(instance);
    }

    public static Vaatu getInstance() {
        return instance;
    }
}
