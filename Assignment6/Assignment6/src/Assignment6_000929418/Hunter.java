package Assignment6_000929418;

/**
 * Represents a Hunter, a type of Inhabitant with a specific damage multiplier.
 * Inherits common properties and behaviors from the Inhabitant class.
 */
public class Hunter extends Inhabitant {
    /** The damage multiplier specific to the Hunter */
    private int damageMultiplier;

    /**
     * Constructs a new Hunter with the specified attributes.
     * @param name The name of the Hunter
     * @param strength The strength of the Hunter
     * @param agility The agility of the Hunter
     * @param healthRating The health rating of the Hunter
     * @param damageMultiplier The damage multiplier of the Hunter
     */
    public Hunter(String name, int strength, int agility, int healthRating, int damageMultiplier) {
        super(name, strength, agility, healthRating);
        this.damageMultiplier = damageMultiplier;
    }

    /**
     * Gets the damage multiplier of the Hunter.
     * @return The damage multiplier of the Hunter
     */
    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    /**
     * Sets the health rating of the Hunter.
     * Allows additional validation or logic specific to Hunters, if any.
     * @param healthRating The new health rating to set
     */
    @Override
    public void setHealthRating(int healthRating) {
        // Additional validation or logic specific to Hunters, if any
        super.setHealthRating(healthRating);
    }

    /**
     * Additional methods specific to Hunter, if any, can be added here.
     */
}
