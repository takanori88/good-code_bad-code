package chap06.flag_args;

public class HitPointDamage implements Damage{

    Member member;

    HitPointDamage (Member member) {
        this.member = member;
    }

    @Override
    public void execute(int damageAmount) {
        member.hitpoint -= damageAmount;
        if (0 < member.hitpoint) return;

        member.hitpoint = 0;
        member.addState(StateType.dead);
    }
}
