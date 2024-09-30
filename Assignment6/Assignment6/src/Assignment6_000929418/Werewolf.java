package Assignment6_000929418;

/**
 * Represents a Werewolf, a type of Inhabitant with a specific pack and alpha status.
 * Inherits common properties and behaviors from the Inhabitant class.
 */
public class Werewolf extends Inhabitant {
    /** The pack of the werewolf */
    private String pack;
    /** Indicates whether the werewolf is the alpha */
    private boolean alpha;

    /**
     * Constructs a new Werewolf with the specified attributes.
     * @param name The name of the werewolf
     * @param strength The strength of the werewolf
     * @param agility The agility of the werewolf
     * @param healthRating The health rating of the werewolf
     * @param pack The pack of the werewolf
     * @param alpha Indicates whether the werewolf is the alpha
     */
    public Werewolf(String name, int strength, int agility, int healthRating, String pack, boolean alpha) {
        super(name, strength, agility, healthRating);
        this.pack = pack;
        this.alpha = alpha;
    }

    /**
     * Gets the pack of the werewolf.
     * @return The pack of the werewolf
     */
    public String getPack() {
        return pack;
    }

    /**
     * Checks if the werewolf is the alpha.
     * @return True if the werewolf is the alpha, false otherwise
     */
    public boolean isAlpha() {
        return alpha;
    }

    /**
     * Returns a string representation of the werewolf, including its name, pack, alpha status, strength, agility, and health rating.
     * @return A string representation of the werewolf
     */
    @Override
    public String toString() {
        return "Werewolf{" +
                "name='" + getName() + '\'' +
                ", pack='" + pack + '\'' +
                ", alpha=" + alpha +
                ", strength=" + getStrength() +
                ", agility=" + getAgility() +
                ", healthRating=" + getHealthRating() +
                '}';
    }
}
