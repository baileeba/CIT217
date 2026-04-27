/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ba5714286.assignment;

/**
 *
 * @author clxud
 */
public class ProductNode {
    
    int productId;
    String productName;
    int quantity;
    double price;
    ProductNode next;
    
    public ProductNode(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
    
}
