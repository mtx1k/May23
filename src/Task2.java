//Objective: Learn how to use streams with custom objects and perform operations like filter, map, and collect.
//Create a class Person with fields name and age.
//Create a list of Person objects.
//Use a stream to filter out people who are younger than 18.
//Use a stream to extract the names of all people.
//Collect these names into a list and print them.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private List<Person> persons = new ArrayList<>();

    public Task2() {
        persons.add(new Person("Anna", 37));
        persons.add(new Person("Alexandra", 9));
        persons.add(new Person("Oksana", 45));
        persons.add(new Person("Solomiia", 1));
    }

    public void filterYounger18() {
        persons = persons.stream().filter(o1 -> o1.getAge() < 18).toList();
    }

    public List<String> extractNames() {
        return persons.stream().map(Person::getName).toList();
    }

    public void print(List<String> list) {
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
    public void print() {
        persons.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

}
