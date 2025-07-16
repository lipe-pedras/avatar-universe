package br.edu.unifei.ecot12;

public class AvatarBending implements BendInterface {
    private static Element elements[] = { Air.getInstance(), Fire.getInstance(), Earth.getInstance(),
            Water.getInstance() };

    private int elementsMastery[];
    private Avatar avatar;

    @Override
    public boolean isSpecialBending() {
        System.err.println("Avatars doesn't have special bendings.");
        return false;
    }

    @Override
    public void setSpecialBending(boolean v) {
        System.err.println("Avatars doesn't have special bendings.");
        return;
    }

    AvatarBending(Avatar avatar) {
        this.avatar = avatar;
    }

    public int getElementMastery() {
        System.err.println("Avatars have 4 elements, you should use the methods: Avatar.getAirMastery()");
        return 0;
    }

    public void setElementMastery(int v) {
        System.err.println("Avatars have 4 elements, you should use the methods: Avatar.setAirMastery()");
    }

    public int[] getElementsMastery() {
        return elementsMastery;
    }

    public void setElementsMastery(int[] v) {
        if (v != null && v.length == 4) {
            this.elementsMastery = v;
        } else
            System.err.println("Since Avatars have 4 elements to manipulate, you should pass a vector with size 4.\n");
    }

    private String bendAir() {
        return elements[0].bend(avatar.isAvatarState() ? 101 : elementsMastery[0]);
    }

    private String bendFire() {
        return elements[1].bend(avatar.isAvatarState() ? 101 : elementsMastery[1]);
    }

    private String bendEarth() {
        return elements[2].bend(avatar.isAvatarState() ? 101 : elementsMastery[2]);
    }

    private String bendWater() {
        return elements[3].bend(avatar.isAvatarState() ? 101 : elementsMastery[3]);
    }

    @Override
    public void bend(String name) {
        System.out.println(name + " is an Avatar. Which of the four elements will he use?\n"
                + "1. Air\n"
                + "2. Fire\n"
                + "3. Earth\n"
                + "4. Water\n");
        // Loop until a valid choice is made
        while (true) {
            System.out.print("Enter the number corresponding to your choice: ");
            String choice = scanner.nextLine();

            // Check if the input is valid
            switch (choice) {
                case "1":
                    System.out.println(name + this.bendAir());
                    return;
                case "2":
                    System.out.println(name + this.bendFire());
                    return;
                case "3":
                    System.out.println(name + this.bendEarth());
                    return;
                case "4":
                    System.out.println(name + this.bendWater());
                    return;
                default:
                    System.out.println("\nInvalid choice. Please choose a number between 1 and 4.\n");
            }
        }
    }
}
