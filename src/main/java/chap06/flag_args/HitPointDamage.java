package chap06.flag_args;

public class HitPointDamage implements Damage{

    private final Member member;

    HitPointDamage (Member member) {
        this.member = member;
    }

    @Override
    public Member execute(int damageAmount) {

        int hitPoint = member.hitPoint -damageAmount;
        if (0 < hitPoint) {
            return new Member(hitPoint, member.magicPoint);
        }

        return new Member(0, member.magicPoint);
    }
}
