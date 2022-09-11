package chap07.collection;

import chap06.flag_args.StateType;

public class Member {
    public final int hitPoint;
    public final int magicPoint;
    public final int id;

    Member(final int id, final int hitPoint, final int magicPoint) {
        this.id = id;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
    }

    public boolean isAlive() {
        return true;
    }

    public void addState(StateType stateType) {

    }
}
