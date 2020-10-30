import java.util.*;

public class Summons {
    public static void main(String[] args) {
        Gacha summon = new Gacha(); 
        // Rolling the Gacha
        List<Character> rolls = summoning(10, summon);
        System.out.println(rolls);
    }

    private static List<Character> summoning(int num_rolls, Gacha gacha) { // function to summon characters
        List<Character> Summons = new ArrayList<Character>();
        for (int i = 0; i < num_rolls; i++) {
            roll(gacha, Summons);
        }
        return Summons;
    }

    private static int pullRate() { // A biased randomiser for each rarity. I used random to make random.
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

    private static void roll(Gacha pulls, List<Character> summons) { // This function will call in the biased function and will add to the summoned list based off the result.
        Random randomizer = new Random();
        if (pullRate() == 5) {
            summons.add(pulls.getFive_summon().get(randomizer.nextInt(pulls.getFive_summon().size())));
        } else if (pullRate() == 4) {
            summons.add(pulls.getFour_summon().get(randomizer.nextInt(pulls.getFour_summon().size())));
        } else {
            summons.add(pulls.getThree_summon().get(randomizer.nextInt(pulls.getThree_summon().size())));
        }
    }
}