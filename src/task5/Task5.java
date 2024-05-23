//Exercise 5: Creating a Basic Class
//Concepts: Classes, Objects, Methods, Encapsulation
//Task:
//Create a class named Book with the following private fields:
//String title
//String author
//double price
//Implement getter and setter methods for each field.
//Write a toString method to return a string representation of the book.
//Create a test class with a main method. In this method:
//Create three Book objects.
//Set their attributes using the setter methods.
//Print their details using the toString method.

package task5;

public class Task5 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setTitle("Title1");
        book1.setAuthor("Author1");
        book1.setPrice(1);
        book2.setTitle("Title2");
        book2.setAuthor("Author2");
        book2.setPrice(2);
        book3.setTitle("Title3");
        book3.setAuthor("Author3");
        book3.setPrice(3);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
