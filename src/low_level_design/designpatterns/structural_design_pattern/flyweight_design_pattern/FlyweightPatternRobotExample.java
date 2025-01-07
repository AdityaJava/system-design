package low_level_design.designpatterns.structural_design_pattern.flyweight_design_pattern;

import java.util.HashMap;

// Flyweight Interface
interface Animal {
    void display(String color, String action);
}

// Concrete Flyweight Class: Robot
class Robot implements Animal {
    private final String type; // Intrinsic state

    public Robot() {
        this.type = "Robot";
    }

    @Override
    public void display(String color, String action) { // Extrinsic state
        System.out.println(type + " [Color: " + color + ", Action: " + action + "]");
    }
}

// Concrete Flyweight Class: Humanoid
class Humanoid implements Animal {
    private final String type; // Intrinsic state

    public Humanoid() {
        this.type = "Humanoid";
    }

    @Override
    public void display(String color, String action) { // Extrinsic state
        System.out.println(type + " [Color: " + color + ", Action: " + action + "]");
    }
}

// Concrete Flyweight Class: Dog
class Dog implements Animal {
    private final String type; // Intrinsic state

    public Dog() {
        this.type = "Dog";
    }

    @Override
    public void display(String color, String action) { // Extrinsic state
        System.out.println(type + " [Color: " + color + ", Action: " + action + "]");
    }
}

// Flyweight Factory
class AnimalFactory {
    private static final HashMap<String, Animal> animals = new HashMap<>();

    public static Animal getAnimal(String type) {
        if (!animals.containsKey(type)) {
            switch (type) {
                case "Robot":
                    animals.put(type, new Robot());
                    break;
                case "Humanoid":
                    animals.put(type, new Humanoid());
                    break;
                case "Dog":
                    animals.put(type, new Dog());
                    break;
                default:
                    throw new IllegalArgumentException("Unknown animal type: " + type);
            }
            System.out.println("Created new " + type + " instance.");
        }
        return animals.get(type);
    }
}

// Client Code
public class FlyweightPatternRobotExample {
    public static void main(String[] args) {
        Animal robot1 = AnimalFactory.getAnimal("Robot");
        robot1.display("Red", "Walking");

        Animal robot2 = AnimalFactory.getAnimal("Robot");
        robot2.display("Blue", "Running");

        Animal humanoid1 = AnimalFactory.getAnimal("Humanoid");
        humanoid1.display("Green", "Talking");

        Animal humanoid2 = AnimalFactory.getAnimal("Humanoid");
        humanoid2.display("Yellow", "Walking");

        Animal dog1 = AnimalFactory.getAnimal("Dog");
        dog1.display("Brown", "Barking");

        Animal dog2 = AnimalFactory.getAnimal("Dog");
        dog2.display("Black", "Running");

        // Verifying Flyweight
        System.out.println("Robot objects are the same instance: " + (robot1 == robot2));
        System.out.println("Humanoid objects are the same instance: " + (humanoid1 == humanoid2));
        System.out.println("Dog objects are the same instance: " + (dog1 == dog2));
    }
}
