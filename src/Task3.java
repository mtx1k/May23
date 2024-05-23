//Exercise 3: Reduce Operation
//Objective: Understand the reduce operation to perform aggregation tasks.
//Create a list of integers.
//Use the reduce method to find the sum of all integers in the list.
//Use the reduce method to find the product of all integers in the list.

import java.util.Arrays;
import java.util.List;

public class Task3 {
    private List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);

    public Task3() {

    }

    public int getSumInList() {
        return integerList.stream().reduce(0, Integer::sum);
    }

    public int getProductInList() {
        return integerList.stream().reduce(1, (a, b) -> a * b);
    }

    public void print() {
        integerList.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
