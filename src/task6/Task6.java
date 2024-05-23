//Concepts: Inheritance, Method Overriding
//Task:
//1 Create a base class Animal with the following:
//-A String name field.
//-A constructor to initialize the name.
//-A method makeSound that prints a generic sound.
//2 Create two subclasses Dog and Cat that extend Animal:
//-Override the makeSound method to print specific sounds ("Bark" for Dog and "Meow" for Cat).
//3 In the test class main method:
//-Create instances of Dog and Cat.
//-Call the makeSound method on both instances and observe the overridden behavior.

package task6;

public class Task6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
