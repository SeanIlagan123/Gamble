import java.util.*;

public class Gacha {
    private List<Character> five_summon;
    private List<Character> four_summon;
    private List<Character> three_summon;

    public Gacha() {
        five_summon = new ArrayList<Character>();
        four_summon = new ArrayList<Character>();
        three_summon = new ArrayList<Character>();

        // Random test cases
        this.addSummon(new Character("Sean", "Male", new Rarity(5), 20));
        this.addSummon(new Character("IsOok", "Male", new Rarity(4), 20));
        this.addSummon(new Character("BoOsk", "Male", new Rarity(3), 20));
        this.addSummon(new Character("Ray", "Male", new Rarity(3), 17));
        this.addSummon(new Character("Orange", "Male", new Rarity(3), 6));
        this.addSummon(new Character("Blue", "Male", new Rarity(3), 34));
        this.addSummon(new Character("Violet", "Female", new Rarity(3), 41));
        this.addSummon(new Character("Namk", "Male", new Rarity(3), 34));
        this.addSummon(new Character("Dome", "Male", new Rarity(3), 54));
    }

    public void addSummon(Character character) {
        if (character.getRarity().getValue() == 5) {
            if (!five_summon.contains(character)) { //5* raritiy
                five_summon.add(character);
            }
        } else if (character.getRarity().getValue() == 4) {
            if (!four_summon.contains(character)) { //5* raritiy
                four_summon.add(character);
            }
        } else {
            if (!three_summon.contains(character)) { //5* raritiy
                three_summon.add(character);
            }
        }
    }

    public List<Character> getFive_summon() {
        return five_summon;
    }

    public List<Character> getFour_summon() {
        return four_summon;
    }

    public List<Character> getThree_summon() {
        return three_summon;
    }

}