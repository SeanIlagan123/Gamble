import java.util.*;

public class Summons {
    public static void main(String[] args) {
        Gacha summon = new Gacha(); 
        // Rolling the Gacha
        List<Character> rolls = summoning(10, summon);
        System.out.println(rolls);
    }

    private static List<Character> summoning(int num_rolls, Gacha gacha) {
        List<Character> Summons = new ArrayList<Character>();
        for (int i = 0; i < num_rolls; i++) {
            roll(gacha, Summons);
        }
        return Summons;
    }

    private static int pullRate() { // A biased randomiser for each rarity
        int pullRarity;
        Random rand = new Random();
        int chance = rand.nextInt(100); // get a random number between 0-99
        if (chance >= 0 && chance < 10) { // 10% for 5 star
            pullRarity = 5;
            return pullRarity;
        } 
        else if (chance >= 10 && chance < 30) { // 20 % for 4 star
            pullRarity = 4;
            return pullRarity;
        } else { // 70% for rest
            pullRarity = 3;
            return pullRarity;
        }
    }

    private static void roll(Gacha pulls, List<Character> summons) { // This function will 
        Random randomizer = new Random();
        if (pullRate() == 5) {
            summons.add(pulls.getFive_summon().get(randomizer.nextInt(pulls.getFive_summon().size())));
            System.out.println("5");
        } else if (pullRate() == 4) {
            summons.add(pulls.getFour_summon().get(randomizer.nextInt(pulls.getFour_summon().size())));
            System.out.println("4");
        } else {
            summons.add(pulls.getThree_summon().get(randomizer.nextInt(pulls.getThree_summon().size())));
            System.out.println("3");
        }
    }
}