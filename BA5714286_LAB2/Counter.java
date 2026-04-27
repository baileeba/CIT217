/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.two;

/**
 *
 * @author clxud
 */
public class Counter {
    private static int count = 0;
    private static final int MAX_COUNT = 10; // static constant

    //c onstructor 
    public Counter() {
        count++;
        System.out.println("object made, count is curently: " + count);
    }

    //static method to view count
    public static int getCount() {
        return count;
    }

    //static method to view the constant
    public static int getMaxCount() {
        return MAX_COUNT;
    }
}
    
