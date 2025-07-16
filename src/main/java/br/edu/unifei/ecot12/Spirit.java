package br.edu.unifei.ecot12;

public class Spirit extends Being {
    public enum enumSide {
        GOOD,
        BAD;
    }

    private enumSide side;

    public enumSide getSide() {
        return side;
    }

    public void setSide(enumSide side) {
        this.side = side;
    }
}
