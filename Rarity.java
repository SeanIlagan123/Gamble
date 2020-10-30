public class Rarity {
    private int value;

    public Rarity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}