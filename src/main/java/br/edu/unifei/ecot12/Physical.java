package br.edu.unifei.ecot12;

import java.util.ArrayList;

import br.edu.unifei.ecot12.Spirit.enumSide;

public abstract class Physical extends Being {
    private int spiritual_lvl;
    private BendInterface bending;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    public int getSpiritual_lvl() {
        return spiritual_lvl;
    }

    public void setSpiritual_lvl(int spiritual_lvl) {
        this.spiritual_lvl = spiritual_lvl;
    }

    public BendInterface getBending() {
        return bending;
    }

    public void setBending(BendInterface bending) {
        this.bending = bending;
    }

    public ArrayList<Weapon> getWeapons() {
        return this.weapons;
    }

    public void bendSpirit(Being target) {
        if (spiritual_lvl > 99) {
            if (target instanceof Spirit) {
                ((Spirit) target).setSide(enumSide.GOOD);
            } else if (target instanceof Physical) {
                if (((Physical) target).getBending() != null) {
                    ((Physical) target).setBending(null);
                }
            }
        }
    }

    public void bend() {
        if (this.bending != null) {
            this.getBending().bend(this.getName());
            return;
        } else {
            System.out.println(getName() + " isn't a bender.");
            return;
        }
    }
}
