//Objective: Understand the performance benefits of lazy evaluation in stream pipelines.
//Create a list of integers from 1 to 10,000.
//Use a stream to:
//-Filter out all numbers that are multiples of 3.
//-Map each remaining number to its square root.
//-Limit the result to the first 10 elements.
//Print the resulting elements and measure the time taken to perform the operations.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    private final List<Integer> integerList = new ArrayList<>();
    private List<Double> result;

    public Task4 () {
        fillIntegerList();
    }

    private void fillIntegerList() {
        for (int i = 1; i <= 10000; i++) {
            integerList.add(i);
        }
    }

    public void doTask4() {
        filterNumbersMultiples3();
        squareNumbersInList();
        limitFirst10();
    }

    private void filterNumbersMultiples3() {
        result = integerList.stream().filter(n -> n % 3 == 0).map(Integer::doubleValue).collect(Collectors.toList());
    }

    private void squareNumbersInList() {
        result = result.stream().map(Math::sqrt).toList();
    }

    private void limitFirst10() {
        result = result.stream().limit(10).toList();
    }

    public void print() {
        result.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
