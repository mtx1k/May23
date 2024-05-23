package task8;

public abstract class Employee {
    private String name;

    public abstract double calculateSalary();

    public void getDetails() {
        System.out.println("name = " + name);
    }
}
