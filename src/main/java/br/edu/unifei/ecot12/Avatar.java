package br.edu.unifei.ecot12;

import java.util.Stack;

public class Avatar extends Human {
    private static Stack<Avatar> pastAvatars = new Stack<Avatar>();
    private boolean avatarState;

    @Override
    public void setBending(BendInterface bending) {
        if (bending instanceof BendInterface) {
            super.callsuperSetBending(bending);
        }
        else {
            System.err.println("This object's type is Avatar. You should use AvatarBending type for it.");
        }
    }

    public boolean isAvatarState() {
        return avatarState;
    }

    public void setAvatarState(boolean avatarState) {
        this.avatarState = avatarState;
    }

    public static Stack<Avatar> getPastAvatars() {
        return pastAvatars;
    }

    public static Avatar createAvatar() {
        if (!pastAvatars.isEmpty() && pastAvatars.peek().isAlive()) {
            return pastAvatars.peek();
        }
        return new Avatar();
    }

    private Avatar() {
        Avatar.getPastAvatars().add(this);
        this.setBending(new AvatarBending(this));
    };
}
