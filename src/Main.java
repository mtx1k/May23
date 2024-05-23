import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Task1 task1 = new Task1();
        task1.print();
        task1.filterEvenNumbers();
        task1.squareEachNumber();
        task1.print();

        System.out.println("Task2");

        Task2 task2 = new Task2();
        task2.print();
        task2.filterYounger18();
        List<String> names = task2.extractNames();
        task2.print(names);

        System.out.println("Task3");
        Task3 task3 = new Task3();
        task3.print();
        System.out.println("Sum = " + task3.getSumInList());
        System.out.println("Product = " + task3.getProductInList());

        System.out.println("Task4");
        Task4 task4 = new Task4();
        task4.filterNumbersMultiples3();
        task4.squareNumbersInList();
        task4.limitFirst10();
        task4.print();

    }
}