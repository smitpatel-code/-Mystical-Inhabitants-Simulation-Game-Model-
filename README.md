# -Mystical-Inhabitants-Simulation-Game-Model-
This Java project simulates a world inspired by mystical creatures inhabiting the small town of Ballybeg, north of Dublin, in Old Ireland. In this project, we model the interactions between Werewolves, Witches, and Humans using Object-Oriented Programming principles such as inheritance, encapsulation, association, and method overriding.

The focus is on creating a class hierarchy that captures the unique abilities and behaviors of these inhabitants, allowing them to engage in combat, healing, and cooperation. The project is designed to illustrate the use of constructors, instance variables, inheritance, and method overriding while also adhering to object-oriented design best practices.

Features
Inhabitants: Each inhabitant (Werewolf, Witch, or Human) has a set of attributes: Name, Strength, Agility, and Health. These attributes can be raised or lowered within a range, and each Inhabitant has a predefined way to attack, defend, or heal.

Classes and Inheritance:

Werewolf: Pack-oriented creatures with a minimum threshold of strength, agility, and health.
Witch: Mystical beings who may assist humans by increasing their magic rating.
Humans: Divided into Healers and Hunters, each with unique abilities. Healers can restore health points, while Hunters deal extra damage when attacking.
Combat Simulation: Inhabitants can engage in turn-based combat where their attack and defense mechanisms are determined by their attributes. The combat system accounts for defense values, loyalty between pack members, and unique healing abilities.

Healing and Strengthening: Healers can restore health, and witches can increase the magical power of healers through their own strength.

Dynamic Object Behavior: The project leverages polymorphism and method overriding to ensure dynamic behavior across inhabitants (e.g., different damage calculations for Hunters and other inhabitants).

Class Design and Structure
The project is structured around a clear inheritance model, with common attributes and behaviors encapsulated in an abstract Inhabitant class. Werewolves, Witches, and Humans inherit from this base class while extending or overriding specific methods.

Encapsulation: All instance variables are private and accessed through getter and setter methods.
Overriding: Attack, defense, and healing methods are overridden to account for specific behaviors of each class type.
Constructors: Each class includes multiple constructors to allow for detailed or random initialization of object attributes.
UML Diagram: The design process is documented with a UML class diagram that outlines the relationships between classes.
