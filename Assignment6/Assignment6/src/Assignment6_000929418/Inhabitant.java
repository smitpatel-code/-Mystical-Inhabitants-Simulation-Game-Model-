package Assignment6_000929418;

import java.util.Random;

/**
 * Represents an inhabitant with attributes such as name, strength, agility, and health rating.
 * This class provides methods to simulate attacks and defenses among inhabitants.
 * @author Smit Patel
 */
public class Inhabitant {
    /** Name of the inhabitant */
    private String name;

    /** Strength of the inhabitant */
    private int strength;

    /** Agility of the inhabitant */
    private int agility;

    /** Health rating of the inhabitant */
    private int healthRating;

    /**
     * Constructor to initialize an inhabitant with the specified attributes.
     * @param name The name of the inhabitant
     * @param strength The strength of the inhabitant
     * @param agility The agility of the inhabitant
     * @param healthRating The health rating of the inhabitant
     */
    public Inhabitant(String name, int strength, int agility, int healthRating) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.healthRating = healthRating;
    }

    /**
     * Gets the name of the inhabitant.
     * @return The name of the inhabitant
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the strength of the inhabitant.
     * @return The strength of the inhabitant
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the agility of the inhabitant.
     * @return The agility of the inhabitant
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Gets the health rating of the inhabitant.
     * @return The health rating of the inhabitant
     */
    public int getHealthRating() {
        return healthRating;
    }

    /**
     * Sets the health rating of the inhabitant.
     * @param healthRating The new health rating to set
     */
    public void setHealthRating(int healthRating) {
        this.healthRating = healthRating;
    }

    /**
     * Checks if the inhabitant is alive.
     * @return true if the inhabitant's health rating is greater than 0, false otherwise
     */
    public boolean isAlive() {
        return healthRating > 0;
    }

    /**
     * Calculates the damage the inhabitant can inflict based on their attributes.
     * @return The calculated damage value
     */
    public int calculateDamage() {
        return (strength + agility + healthRating) / 3;
    }

    /**
     * Attacks the specified target inhabitant.
     * Hunters inflict double the normal damage.
     * @param target The target inhabitant to attack
     */
    public void attack(Inhabitant target) {
        if (!isAlive()) {
            System.out.println(name + " is dead and cannot be attacked.");
            return;
        }

        int damage = calculateDamage();
        if (this instanceof Hunter) {
            damage *= 2; // Hunters do twice the normal damage
        }

        target.defend(damage);
    }

    /**
     * Defends against an attack by reducing the health rating based on a random defense value.
     * @param damage The damage inflicted by the attacker
     */
    public void defend(int damage) {
        if (!isAlive()) {
            System.out.println(name + " is already dead.");
            return;
        }

        // Randomly generate a defense value between 1 and 10
        Random random = new Random();
        int defenseValue = random.nextInt(10) + 1;

        // Calculate actual damage after defense
        int actualDamage = damage / defenseValue;
        if (actualDamage < 1) {
            actualDamage = 1; // Minimum 1 damage point
        }

        // Reduce health rating
        healthRating -= actualDamage;

        System.out.println(name + " defends against the attack and loses " + actualDamage + " health points.");

        // Check if the inhabitant dies
        if (!isAlive()) {
            System.out.println(name + " has been killed.");
        }
    }

    /**
     * Returns a string representation of the inhabitant.
     * @return A string containing the inhabitant's attributes
     */
    @Override
    public String toString() {
        return "Inhabitant{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", healthRating=" + healthRating +
                '}';
    }
}
