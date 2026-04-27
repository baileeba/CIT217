/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.two;

/**
 *
 * @author clxud
 */
public class Circle {
    private double radius;
    
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    //getter

    public double getRadius() {
        return radius;
    }
    
    //setter

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //calc area using math pi constant
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    //calc circumfrench
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
