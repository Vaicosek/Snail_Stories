package monster;

import java.util.ArrayList;
import java.util.Arrays;

public class MonsterTier1 extends MonsterBase {


    public MonsterTier1(int GroupLevel) {
        super(1, GroupLevel);

        names = new ArrayList<String>(
                Arrays.asList(
                        "Chicken",
                        "Rat",
                        "Bat",
                        "Snake",
                       " Lizard",
                       " Beetle",
                       " Frog",
                       " Crab",
                       " Scorpion"
                        ));

    }


}


