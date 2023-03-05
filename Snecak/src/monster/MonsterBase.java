package monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MonsterBase {

    private static final int TIER_1 = 1;
    private static final int TIER_2 = 2;
    private static final int TIER_3 = 3;
    private static final int TIER_4 = 4;
    private static final int TIER_5 = 5;

    public int HP;
    public int GroupLevel;
    public int tier;

    public String Name;


    public MonsterBase(int tier, int GroupLevel) {
        this.tier = tier;
        InitilizeName();
        Name = getRandomName();
        this.GroupLevel = GroupLevel;

        switch (tier) {
            case TIER_1 -> {
                HP = 20 * GroupLevel;

            }
            case TIER_2 -> {
                HP = 30 * GroupLevel;

            }
            case TIER_3 -> {
                HP = 40 * GroupLevel;

            }
            case TIER_4 -> {
                HP = 50 * GroupLevel;

            }
            case TIER_5 -> {
                HP = 1000 * GroupLevel;

            }

        }
    }


    public static MonsterBase chooseMonster(List<MonsterBase> monsters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a monster to attack:");
        int i = 1;
        for (MonsterBase monster : monsters) {
            System.out.printf("%d. %s (level %d)%n", i, monster.getName(), monster.getGroupLevel());
            i++;
        }
        int choice = scanner.nextInt();
        while (choice < 1 || choice > monsters.size()) {
            System.out.println("Invalid choice. Choose a number between 1 and " + monsters.size() + ":");
            choice = scanner.nextInt();
        }
        return monsters.get(choice - 1);
    }

    public int getGroupLevel() {
        return GroupLevel;
    }

    public String getName() {
        return Name;
    }

    protected ArrayList<String> names;

    String getRandomName() {
        int i;
        try {
            i = Dice.getNextNumber(0, names.size() - 1);
            return names.get(i);
        } catch (Exception e) {
            return "";
        }
    }

    public int Attack() {
        return Dice.getNextNumber(1, tier * 10 + (10 * GroupLevel));
    }

    public int getHP() {
        return HP;
    }

    abstract void InitilizeName();


}


