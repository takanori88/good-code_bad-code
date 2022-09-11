package chap06.flag_args;

public class MagicPointDamage implements Damage{
    private final Member member;

    MagicPointDamage(Member member) {
        this.member = member;
    }

    @Override
    public Member execute(int damageAmount) {
        int magicPoint = member.magicPoint - damageAmount;
        if (0 < magicPoint) {
            return new Member(member.hitPoint, magicPoint);
        }
        return new Member(member.hitPoint, 0);
    }
}
