package br.edu.unifei.ecot12;

public class Raava extends GreatSpirit {
    private static final Raava instance = new Raava();
    private RaavaAndVaatuMediator mediator = RaavaAndVaatuMediator.getInstance();

    private Raava() {
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
        mediator.balance(instance);
    }

    public static Raava getInstance() {
        return instance;
    }
}
