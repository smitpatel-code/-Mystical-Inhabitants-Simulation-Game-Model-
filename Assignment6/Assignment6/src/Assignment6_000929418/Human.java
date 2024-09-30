package Assignment6_000929418;

/**
 * Represents a Human, a type of Inhabitant with a specific role.
 * Inherits common properties and behaviors from the Inhabitant class.
 */
public class Human extends Inhabitant {
    /** The role of the human */
    private String role;

    /**
     * Constructs a new Human with the specified attributes.
     * @param name The name of the human
     * @param strength The strength of the human
     * @param agility The agility of the human
     * @param healthRating The health rating of the human
     * @param role The role of the human
     */
    public Human(String name, int strength, int agility, int healthRating, String role) {
        super(name, strength, agility, healthRating);
        this.role = role;
    }

    /**
     * Gets the role of the human.
     * @return The role of the human
     */
    public String getRole() {
        return role;
    }

    /**
     * Returns a string representation of the human, including its name, role, strength, agility, and health rating.
     * @return A string representation of the human
     */
    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", role='" + role + '\'' +
                ", strength=" + getStrength() +
                ", agility=" + getAgility() +
                ", healthRating=" + getHealthRating() +
                '}';
    }
}
