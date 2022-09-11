package chap06.flag_args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplyDamageLogicTest {

    @Test
    void applyHitPointDamage() {
        Member member = new Member();
        member.hitpoint = 100;
        member.magicPoint = 100;
        ApplyDamageLogic applyDamageLogic = new ApplyDamageLogic(member);
        applyDamageLogic.applyDamage(DamageType.hitPoint, 100);

        assertEquals(0, member.hitpoint);
    }

    @Test
    void applyMagicPointDamage() {
        Member member = new Member();
        member.hitpoint = 100;
        member.magicPoint = 100;
        ApplyDamageLogic applyDamageLogic = new ApplyDamageLogic(member);
        applyDamageLogic.applyDamage(DamageType.magicPoint, 200);

        assertEquals(0, member.magicPoint);
    }
}