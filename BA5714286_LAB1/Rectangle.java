/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.one;
//this is question two!
/**
 *
 * @author clxud
 */
public class Rectangle {
    private double length;
    private double width;
    
    //constructor

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    //getters

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    //setters

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    //calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    //calculate area
    public double calculateArea(){
        return length * width;
    }
}
