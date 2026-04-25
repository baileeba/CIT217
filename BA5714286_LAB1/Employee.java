/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.one;
//this is question one
/**
 *
 * @author clxud
 */
public class Employee {
    private String name;
    private double salary;
    
    //constructor + parameters
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    //assign values
    public void setEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //calculate raise
    public void calculateRaise(double percentage) {
        if (percentage < 0.0) {
            System.out.println("invalid raise percetange, it has to be 0 or larger.");
        } else if (percentage == 0.0) {
            System.out.println("salary: " + salary);
        } else {
            salary = salary + (salary * percentage / 100);
            System.out.println("salary: " + salary);
        }
    }
}
