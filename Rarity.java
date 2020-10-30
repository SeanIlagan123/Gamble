public class Rarity {
    private int rarity;

    // If rarity is 5* it is 10% chance
    // if rarity is 4* it is 20% chance
    // if rarity is 3* it is 70% chance

    public Rarity(int rarity) {

        this.rarity = rarity;

        /* Random rand = Random();
        let chance = rand.nextInt(101); // get a random number between 0-100
        switch (chance) { // defining the rarities.
            case chance.range(0, 10):
                break;
        } */
    }

    public int getRarity() {
        return this.rarity;
    }
}
