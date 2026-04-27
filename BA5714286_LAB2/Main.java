/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.two;

/**
 *
 * @author clxud
 */
public class Main {

    public static void main(String[] args) {
        //book test
        System.out.println("Book: ");
        
        //default constructor
        Book book1 = new Book ();
        book1.setTitle("Jojo's Bizarre Adventure");
        book1.setAuthor("Hirohiko Araki");
        book1.setPrice(12.99);
        System.out.println(book1.toString());
        
        //2nd constructor
        Book book2 = new Book("Shiver", "Junji Ito", 11.99);
        System.out.println(book2.toString());
        
        //copy
        Book book3 = new Book(book2);
        System.out.println(book3.toString());
        
        System.out.println();
        
        //circle test
        System.out.println("Circle:");
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        
        System.out.println();
        
        //counter test
        System.out.println("Counter:");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("total objects made: " + Counter.getCount());
        System.out.println("max count allowed: " + Counter.getMaxCount());
    }
}
