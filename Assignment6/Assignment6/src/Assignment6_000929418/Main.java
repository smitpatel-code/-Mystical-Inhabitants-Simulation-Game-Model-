package Assignment6_000929418;

import java.util.Scanner;

/**
 * Main class for the Assignment6_000929418 package.
 * This class simulates a simple game where different inhabitants can attack or heal each other.
 * Users can choose actions and see the updated state of the inhabitants.
 * @author Smit Patel
 */
public class Main {
    /**
     * Main method to run the simulation.
     * @param args unused
     */
    public static void main(String[] args) {
        // Create an array to hold the inhabitants
        Inhabitant[] inhabitants = new Inhabitant[5];

        // Initialize the inhabitants with specific types and attributes
        inhabitants[0] = new Werewolf("Alpha", 8, 7, 9, "Pack A", true);
        inhabitants[1] = new Werewolf("Werewolf1", 6, 6, 7, "Pack A", false);
        inhabitants[2] = new Witch("Witch1", 5, 8, 6, "Pack A");
        inhabitants[3] = new Healer("Healer1", 4, 5, 6, 7);
        inhabitants[4] = new Hunter("Hunter1", 7, 6, 8, 2);

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // Loop until the user chooses to exit
        while (!userInput.equalsIgnoreCase("exit")) {
            // Print all inhabitants
            System.out.println("\nCurrent Inhabitants:");
            for (int i = 0; i < inhabitants.length; i++) {
                System.out.println((i + 1) + ". " + inhabitants[i]);
            }

            // Allow the user to choose an action (attack or heal)
            System.out.println("\nChoose an action:");
            System.out.println("1. Attack someone");
            System.out.println("2. Heal someone");
            System.out.println("Type 'exit' to quit");
            System.out.print("Enter your choice (1, 2, or 'exit'): ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Ensure the input is valid
            if (!userInput.equals("1") && !userInput.equals("2")) {
                System.out.println("Invalid input. Please enter 1, 2, or 'exit'.");
                continue;
            }

            int choice = Integer.parseInt(userInput);

            switch (choice) {
                case 1:
                    // Attack simulation
                    System.out.println("Choose the attacker:");
                    for (int i = 0; i < inhabitants.length; i++) {
                        System.out.println((i + 1) + ". " + inhabitants[i]);
                    }
                    System.out.print("Enter the attacker's index: ");
                    int attackerIndex = scanner.nextInt() - 1;

                    System.out.println("Choose the target:");
                    for (int i = 0; i < inhabitants.length; i++) {
                        if (i != attackerIndex) {
                            System.out.println((i + 1) + ". " + inhabitants[i]);
                        }
                    }
                    System.out.print("Enter the target's index: ");
                    int targetIndex = scanner.nextInt() - 1;

                    // Perform the attack action
                    Inhabitant attacker = inhabitants[attackerIndex];
                    attacker.attack(inhabitants[targetIndex]);
                    scanner.nextLine(); // Consume the newline character
                    break;

                case 2:
                    // Healing simulation
                    System.out.println("Choose a healer:");
                    for (int i = 0; i < inhabitants.length; i++) {
                        if (inhabitants[i] instanceof Healer) {
                            System.out.println((i + 1) + ". " + inhabitants[i]);
                        }
                    }
                    System.out.print("Enter the healer's index to heal: ");
                    int healerIndex = scanner.nextInt() - 1;

                    System.out.println("Choose someone to heal:");
                    for (int i = 0; i < inhabitants.length; i++) {
                        if (i != healerIndex) {
                            System.out.println((i + 1) + ". " + inhabitants[i]);
                        }
                    }
                    System.out.print("Enter the index of the inhabitant to heal: ");
                    int targetHealIndex = scanner.nextInt() - 1;

                    // Perform the heal action
                    Healer selectedHealer = (Healer) inhabitants[healerIndex];
                    selectedHealer.heal(inhabitants[targetHealIndex]);
                    scanner.nextLine(); // Consume the newline character
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }

            // Print the updated state after the action
            System.out.println("\nUpdated Inhabitants:");
            for (Inhabitant inhabitant : inhabitants) {
                System.out.println(inhabitant);
            }
        }

        System.out.println("Exiting the program.");
    }
}
