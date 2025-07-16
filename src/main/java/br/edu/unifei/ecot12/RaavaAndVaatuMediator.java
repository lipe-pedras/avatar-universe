package br.edu.unifei.ecot12;

public class RaavaAndVaatuMediator {
    private static final RaavaAndVaatuMediator instance = new RaavaAndVaatuMediator();
    private Vaatu vaatu;
    private Raava raava;
    private boolean isBalancing = false;

    public void balance(GreatSpirit v) {
        if (isBalancing) return;
        isBalancing = true;

        if (raava == null) raava = Raava.getInstance();
        if (vaatu == null) vaatu = Vaatu.getInstance();

        if (v instanceof Raava) {
            vaatu.setStrength(100 - raava.getStrength());
        } else if (v instanceof Vaatu) {
            raava.setStrength(100 - vaatu.getStrength());
        }

        isBalancing = false;
    }

    private RaavaAndVaatuMediator() {}

    public static RaavaAndVaatuMediator getInstance() {
        return instance;
    }
}
