package chap06.flag_args;

public class Member {
    public final int hitPoint;
    public final int magicPoint;

    Member(final int hitPoint, final int magicPoint) {
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
    }

    Member updatedStatus(final Member member, int hitPoint, int magicPoint){
       return new Member(hitPoint, magicPoint);
    }

    public void addState(StateType stateType) {

    }
}
