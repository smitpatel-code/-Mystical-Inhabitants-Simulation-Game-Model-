package Assignment6_000929418;

/**
 * Represents a Witch, a type of Inhabitant with an allegiance.
 * Inherits common properties and behaviors from the Inhabitant class.
 */
public class Witch extends Inhabitant {
    /** The allegiance of the Witch */
    private String allegiance;

    /**
     * Constructs a new Witch with the specified attributes.
     * @param name The name of the Witch
     * @param strength The strength of the Witch
     * @param agility The agility of the Witch
     * @param healthRating The health rating of the Witch
     * @param allegiance The allegiance of the Witch
     */
    public Witch(String name, int strength, int agility, int healthRating, String allegiance) {
        super(name, strength, agility, healthRating);
        this.allegiance = allegiance;
    }

    /**
     * Gets the allegiance of the Witch.
     * @return The allegiance of the Witch
     */
    public String getAllegiance() {
        return allegiance;
    }

    /**
     * Returns a string representation of the Witch object.
     * @return A string representation including name, allegiance, strength, agility, and health rating
     */
    @Override
    public String toString() {
        return "Witch{" +
                "name='" + getName() + '\'' +
                ", allegiance='" + allegiance + '\'' +
                ", strength=" + getStrength() +
                ", agility=" + getAgility() +
                ", healthRating=" + getHealthRating() +
                '}';
    }
}
