package abilities;

import hero.HeroTemplate;
import monster.MonsterBase;

public class Inquisition extends AbilityBase {
    public Inquisition() {

    }

    public void use(HeroTemplate hero, MonsterBase monster) {
        int additionalDamage = 0;
        int monsterTier = monster.getTier();

        if (monsterTier == 1 || monsterTier == 2) {
            additionalDamage = 15; // Additional damage for tier 1 and 2 monsters
        }

        int totalDamage = getDamage() + additionalDamage;

        // Apply the total damage to the monster
       setDamage(totalDamage);

    }
}
