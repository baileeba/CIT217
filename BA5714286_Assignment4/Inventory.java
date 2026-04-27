/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ba5714286.assignment;

/**
 *
 * @author clxud
 */
public class Inventory {
    
    private ProductNode head;
    
    public Inventory(){
        head = null;
    }
    
    //checking if product already exists
    public boolean productExists(int id){
        ProductNode current = head;
        while (current != null) {
            if (current.productId == id) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    //add products
    public void addProduct(int id, String name, int quantity, double price) {
        if (productExists(id)) {
            System.out.println("Product ID taken.");
        }
        
        ProductNode newNode = new ProductNode(id, name, quantity, price);
        
        if (head == null) {
            head = newNode;
        } else {
            ProductNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("product added");
    }
    
    //show inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("inventory is empty");
            return;
        }
        System.out.println("\n" + "=".repeat(65));
        System.out.printf("%-6s %-20s %-10s %-12s %-12s%n",
                "ID","Name","qty","Price","Value");
        System.out.println("-".repeat(65));

        ProductNode current = head;
        while (current != null) {
            double value = current.quantity * current.price;
            System.out.printf("%-6d %-20s %-10d $%-11.2f $%-11.2f%n",
                    current.productId, current.productName,
                    current.quantity, current.price, value);
            current = current.next;
        }

        System.out.println("=".repeat(65));
    }

    //search
    public void searchProductById(int id) {
        ProductNode current = head;

        while (current != null) {
            if (current.productId == id) {
                System.out.println("\nProduct Found:");
                System.out.println("ID: " + current.productId);
                System.out.println("Name: " + current.productName);
                System.out.println("Quantity: " + current.quantity);
                System.out.printf("Price: $%.2f%n", current.price);
                return;
            }
            current = current.next;
        }

        System.out.println("product not found");
    }

    //update quantity
    public void updateQuantity(int id, int newQuantity) {
        ProductNode current = head;

        while (current != null) {
            if (current.productId == id) {
                current.quantity = newQuantity;
                System.out.println("quantity updated");
                return;
            }
            current = current.next;
        }

        System.out.println("product not found");
    }

    //delete prod
    public void deleteProduct(int id) {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        if (head.productId == id) {
            System.out.println("product removed: " + head.productName);
            head = head.next;
            return;
        }

        ProductNode previous = head;
        ProductNode current = head.next;

        while (current != null) {
            if (current.productId == id) {
                previous.next = current.next;
                System.out.println("product removed: " + current.productName);
                return;
            }
            previous = current;
            current = current.next;
        }

        System.out.println("product not founf");
    }

    //total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ProductNode current = head;

        while (current != null) {
            total += current.quantity * current.price;
            current = current.next;
        }

        System.out.printf("total Inventory value: $%.2f%n", total);
    }
}
