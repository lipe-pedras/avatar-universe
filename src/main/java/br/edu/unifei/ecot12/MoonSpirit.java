package br.edu.unifei.ecot12;

import java.util.*;

public class MoonSpirit extends Spirit {
    private static final MoonSpirit instance = new MoonSpirit();
    private LinkedList<WaterHumanBending> waterbenders = new LinkedList<WaterHumanBending>();

    public LinkedList<WaterHumanBending> getWaterbenders() {
        return waterbenders;
    }

    public static MoonSpirit getInstance() {
        return instance;
    }

    @Override
    public void setAlive(boolean alive) {
        if (!alive)
            this.death();
        super.setAlive(alive);
    }

    public void death() {
        if (!this.isAlive()) {
            for (WaterHumanBending element : waterbenders) {
                element.setElementMastery(0);
            }
        }
    }

    public void fullmoon(Calendar v) {
        if (((v.getTimeInMillis() * 1000 * 60 * 60 * 24) % 29) == 0) {
            for (WaterHumanBending element : waterbenders) {
                element.setElementMastery(element.getElementMastery() * 10);
            }
        }
    }
}
