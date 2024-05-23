//Exercise 7: Polymorphism with Interfaces
//Concepts: Polymorphism, Interfaces
//Task:
//1 Create an interface Shape with a method double getArea().
//2 Implement two classes Circle and Rectangle that implement the Shape interface:
//- Circle should have a radius field and implement getArea to return the area of the circle.
//- Rectangle should have width and height fields and implement getArea to return the area of the rectangle.
//3 In the test class main method:
//- Create instances of Circle and Rectangle.
//- Store them in a Shape array.
//- Loop through the array and print the area of each shape using the getArea method.

package task7;

public class Task7 {
    public static void main(String[] args) {
        int radius = 5;
        Shape circle = new Circle(radius);
        int width = 3;
        int height = 4;
        Shape rectangle = new Rectangle(width, height);
        System.out.println("radius = " + radius);
        System.out.println("area = " + circle.getArea());
        System.out.println("width = " + width + " height = " + height);
        System.out.println("area = " + rectangle.getArea());
    }
}
