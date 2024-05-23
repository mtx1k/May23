//Exercise 8: Abstract Classes and Methods
//Concepts: Abstract Classes, Abstract Methods
//Task:
//1 Create an abstract class Employee with the following:
//- A String name field.
//- An abstract method double calculateSalary().
//- A concrete method getDetails() that prints the employee’s name.
//2 Create two subclasses SalariedEmployee and HourlyEmployee that extend Employee:
//- SalariedEmployee should have a double annualSalary field and implement calculateSalary to return the annual salary.
//- HourlyEmployee should have double hourlyRate and int hoursWorked fields and implement calculateSalary to return the product of hourly rate and hours worked.
//3 In the test class main method:
//- Create instances of SalariedEmployee and HourlyEmployee.
//- Print their details and calculated salaries.

package task8;

public class Task8 {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee(2000);
        Employee hourlyEmployee = new HourlyEmployee(12, 100);
        System.out.println("Salaried Employee: " + salariedEmployee.calculateSalary());
        System.out.println("Hourly Employee: " + hourlyEmployee.calculateSalary());
    }
}
