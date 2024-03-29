package abilities;
import hero.HeroTemplate;
import monster.MonsterBase;


public class Bite implements NormalAbilityTemplate {

    private int totalDamage;
    private String name = "Bite";
    private int manaCost = 30;
    private boolean unlocked = false;

        public Bite() {

        }

    @Override
    public void cast(HeroTemplate hero, MonsterBase monster) {

        // Calculate total damage
        totalDamage = 8 + hero.getLevel() * 5;

        monster.takeDamage(totalDamage);
        System.out.println("Used " + getName() + "and dealt " + totalDamage);
    }

    @Override
    public int getDamage() {
        return totalDamage;
    }

    @Override
    public void setDamage(int totalDamage) {
    }

    @Override
    public int getManaCost() {
        return 30;
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
        return unlocked;
    }

    @Override
    public void setUnlocked() {
     unlocked = true;
    }
}





