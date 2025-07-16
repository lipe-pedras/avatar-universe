package br.edu.unifei.ecot12;

import java.util.Calendar;
import java.util.LinkedList;

public class SozinComet {
    private static final SozinComet instance = new SozinComet();
    private LinkedList<FireHumanBending> firebenders = new LinkedList<FireHumanBending>();

    public LinkedList<FireHumanBending> getFirebenders() {
        return firebenders;
    }

    private SozinComet() {
    }

    public static SozinComet getInstance() {
        return instance;
    }

    public void appearance(Calendar v) {
        if (v.get(Calendar.YEAR) % 100 == 0) {
            for (FireHumanBending element : firebenders) {
                element.setElementMastery(element.getElementMastery() * 100);
            }
        }
    }

}
