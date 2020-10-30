import java.util.*;

public class Summons {
    public static void main(String[] args) {
        Gacha summon = new Gacha();
        // Character Books = new Character("Books", "Male", 5, 20);
        // summon.addSummon(Books);
        //System.out.println(summon.getSummons());

        // Rolling the Gacha
        List<Character> rolls = roll(5, summon.getSummons());
        System.out.println(rolls);
    }


    private static List<Character> roll(int number, List<Character> pulls) {
        List<Character> Summons = new ArrayList<Character>();
        Random randomizer = new Random();
        for (int i = 0; i < number; i++) {
            Summons.add(pulls.get(randomizer.nextInt(pulls.size()))); // Randomly selects summon and adds it to summons list
        }
        return Summons;
    }
}
