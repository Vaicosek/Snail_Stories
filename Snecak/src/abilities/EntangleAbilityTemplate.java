package abilities;

import hero.HeroTemplate;
import monster.MonsterBase;

public interface EntangleAbilityTemplate extends AbilityTemplate {
    void applyEntangle(HeroTemplate hero, MonsterBase monster);
    int getEntangleDuration(); // Adjust to return int
    void setEntangleDuration(int duration);
}

