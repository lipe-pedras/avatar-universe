package br.edu.unifei.ecot12;

import java.util.Scanner;

public interface BendInterface {
    public static final Scanner scanner = new Scanner(System.in);
    void bend(String name);
    int getElementMastery();
    void setElementMastery(int v);
    int[] getElementsMastery();
    void setElementsMastery(int[] v);
    boolean isSpecialBending();
    void setSpecialBending(boolean v);
}
