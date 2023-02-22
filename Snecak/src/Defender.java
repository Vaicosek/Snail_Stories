import java.util.EnumMap;
import java.util.Scanner;

class Defender implements HeroTemplate {
    private EnumMap<Ability, Object> abilities;
    private int XP;
    private int level;
    private int HP;

    private final String NAME = "Defender";
    public enum Ability {Taunt, HPI, HPII, Turtle, StoneSkin, StrongHandas, Warrior, Shields, BlackSmith, MonsterHunter}

    public Defender(int XP, int level, int HP) {
        this.XP = XP;
        this.level = level;
        this.HP = HP;
        abilities = new EnumMap<>(Defender.Ability.class);
        for (Defender.Ability ability : Defender.Ability.values()) {
            abilities.put(ability, false);
        }
    }
    public void gainAbility() {
        Scanner scanner = new Scanner(System.in);
        Ability[] possibleAbilities = Ability.values();
        for (Ability ability : possibleAbilities) {
            if (!hasAbility(ability)) {
                System.out.println("You can gain the " + ability + " ability.");
            }
        }
        System.out.println("Enter the name of the ability you want to gain, or press 'q' to quit:");
        String abilityName = scanner.nextLine();
        if (abilityName.equalsIgnoreCase("q")) {
            return;
        }
        try {
            Ability chosenAbility = Ability.valueOf(abilityName);
            if (hasAbility(chosenAbility)) {
                System.out.println("You already have the " + chosenAbility + " ability.");
            } else {
                abilities.put(chosenAbility, true);
                System.out.println("You have gained the " + chosenAbility + " ability.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ability name.");
        }
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public boolean hasAbility(Enum ability) {
        return (boolean) abilities.get(ability);
    }
    @Override
    public String getName() {
        return NAME;
    }
}
