/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.one;
//testing all
/**
 *
 * @author clxud
 */
public class Main {

    public static void main(String[] args) {
        //employee test
        Employee emp = new Employee("Pinkie Pie", 50000);
        System.out.println("employee: " + emp.getName());
        System.out.println("salary: " + emp.getSalary());
        emp.calculateRaise(10); //10% raise
        emp.calculateRaise(-5); //inv
        emp.calculateRaise(0); 
        
        System.out.println();
        
        //rectange test
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());
        
        System.out.println();
    }
}
