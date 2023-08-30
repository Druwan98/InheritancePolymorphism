package Lessons.Exercise.InheritancePolymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();


    }
}
