package chap06.flag_args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplyDamageLogicTest {

    @Test
    void applyHitPointDamage() {
        Member member = new Member(100, 100);
        ApplyDamageLogic applyDamageLogic = new ApplyDamageLogic(member);
        Member newMember = applyDamageLogic.applyDamage(DamageType.hitPoint, 100);

        assertEquals(0, newMember.hitPoint);
    }

    @Test
    void applyMagicPointDamage() {
        Member member = new Member(100, 100);
        ApplyDamageLogic applyDamageLogic = new ApplyDamageLogic(member);
        Member newMember = applyDamageLogic.applyDamage(DamageType.magicPoint, 200);

        assertEquals(0, newMember.magicPoint);
    }
}