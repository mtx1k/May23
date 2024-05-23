//Exercise 1: Basic Stream Operations
//Objective: Familiarize yourself with basic stream operations like filter, map, and forEach.
//Create a list of integers from 1 to 20.
//Use a stream to filter out even numbers.
//Use a stream to square each number in the list.
//Print each squared number using forEach.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private List<Integer> integerList = new ArrayList<>();

    public Task1() {
        fillIntegerList();
    }

    private void fillIntegerList() {
        for (int i = 1; i <= 20; i++) {
            integerList.add(i);
        }
    }

    public void filterEvenNumbers() {
        integerList = integerList.stream().filter(integer -> integer % 2 != 0).toList();
    }

    public void squareEachNumber() {
        integerList = integerList.stream().map(integer -> integer * integer).toList();
    }
    public void print() {
        integerList.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
