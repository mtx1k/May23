//Objective: Understand the performance benefits of lazy evaluation in stream pipelines.
//Create a list of integers from 1 to 10,000.
//Use a stream to:
//-Filter out all numbers that are multiples of 3.
//-Map each remaining number to its square root.
//-Limit the result to the first 10 elements.
//Print the resulting elements and measure the time taken to perform the operations.

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private List<Integer> integerList = new ArrayList<>();

    public Task4 () {
        fillIntegerList();
    }

    private void fillIntegerList() {
        for (int i = 1; i <= 10000; i++) {
            integerList.add(i);
        }
    }

    public void filterNumbersMultiples3() {
        integerList = integerList.stream().filter(n -> n % 3 == 0).toList();
    }

    public void squareNumbersInList() {
        integerList = integerList.stream().map(n -> n * n).toList();
    }

    public void limitFirst10() {
        integerList = integerList.stream().limit(10).toList();
    }

    public void print() {
        integerList.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
