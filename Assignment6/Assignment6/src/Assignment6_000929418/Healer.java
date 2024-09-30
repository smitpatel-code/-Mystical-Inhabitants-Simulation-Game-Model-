package Assignment6_000929418;

/**
 * Represents a Healer, a type of Human with the ability to heal other inhabitants.
 * Inherits common properties and behaviors from the Human class.
 * Adds specific attributes and methods related to healing.
 */
public class Healer extends Human {
    /** The magic rating of the healer, determining their healing power */
    private int magicRating;

    /**
     * Constructs a new Healer with the specified attributes.
     * @param name The name of the healer
     * @param strength The strength of the healer
     * @param agility The agility of the healer
     * @param healthRating The health rating of the healer
     * @param magicRating The magic rating of the healer
     */
    public Healer(String name, int strength, int agility, int healthRating, int magicRating) {
        super(name, strength, agility, healthRating, "Healer");
        this.magicRating = magicRating;
    }

    /**
     * Gets the magic rating of the healer.
     * @return The magic rating of the healer
     */
    public int getMagicRating() {
        return magicRating;
    }

    /**
     * Heals the specified target inhabitant.
     * The healing power is determined by the healer's magic rating.
     * @param target The target inhabitant to heal
     */
    public void heal(Inhabitant target) {
        if (magicRating <= 0) {
            System.out.println("Cannot heal, magic power is too low.");
            return;
        }

        int healingScore = magicRating / 2; // Adjust as per your assignment requirements
        int newHealth = target.getHealthRating() + healingScore;
        target.setHealthRating(newHealth);
        magicRating -= 1;

        System.out.println("Healing performed on " + target.getName() + ". New health: " + newHealth);
    }
}
