public class Character {
    private String name;
    private String gender;
    private Rarity rarity;
    private int age;

    public Character(String cName, String cGender, Rarity cRarity, int cAge) {
        name = cName;
        gender = cGender;
        rarity = cRarity;
        age = cAge;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "You got the character " + name;
    }
}
