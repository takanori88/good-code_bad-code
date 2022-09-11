package chap06.flag_args;

public class MagicPointDamage implements Damage{
    Member member;

    MagicPointDamage(Member member) {
        this.member = member;
    }

    @Override
    public void execute(int damageAmount) {
        member.magicPoint -= damageAmount;
        if (0 < member.magicPoint) return;

        member.magicPoint = 0;
    }
}
