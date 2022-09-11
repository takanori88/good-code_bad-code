package chap06.flag_args;

import java.util.HashMap;
import java.util.Map;

public class ApplyDamageLogic {
    private final Map<DamageType, Damage> damages;

    ApplyDamageLogic(Member member) {
        damages = new HashMap<>();
        final HitPointDamage hitPointDamage = new HitPointDamage(member);
        final MagicPointDamage magicPointDamage = new MagicPointDamage(member);

        damages.put(DamageType.hitPoint, hitPointDamage);
        damages.put(DamageType.magicPoint, magicPointDamage);
    }

    void applyDamage(final DamageType damageType, final int damageAmount) {
        final Damage damage = damages.get(damageType);
        damage.execute(damageAmount);
    }
}
