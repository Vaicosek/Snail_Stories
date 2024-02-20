package abilities;

import hero.HeroTemplate;

public class AnimalCompanion implements EntityAbilityTemplate {

    private String entityName;
    private int randomAttack;

    private String name;

    public AnimalCompanion() {
        setName("Animal Companion"); // Assuming setName is defined in AbilityTemplate
    }


    @Override
    public void setRandomAttack(int randomAttack) {
        this.randomAttack = randomAttack;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public void setDamage(int totalDamage) {

    }

    @Override
    public int getManaCost() {
        return 0;
    }

    @Override
    public void setManaCost(int manaCost) {

    }

    @Override
    public void setName(String name) {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isUnlocked() {
        return false;
    }

    @Override
    public void setUnlocked(boolean unlocked) {

    }

    @Override
    public int performAutoAttack() {
        return randomAttack;
    }

    @Override
    public void summonEntity(HeroTemplate hero) {

    }

    public String getEntityName() {
        return entityName;
    }
    @Override
    public void setEntityName(String name) {

    }

}


