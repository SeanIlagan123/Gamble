import java.util.*;

public class Gacha {
    private List<Character> summons;

    public Gacha() {
        summons = new ArrayList<Character>();


        this.summons.add(new Character("Sean", "Male", new Rarity(5), 20));
    }

    public void addSummon(Character character) {
        if (!summons.contains(character)) {
            summons.add(character);
        }
    }

    public void addRarity() {

    }

    public List<Character> getSummons() {
        return this.summons;
    }
}