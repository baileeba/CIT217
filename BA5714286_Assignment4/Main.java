/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ba5714286.assignment;
import java.util.Scanner;

/**
 *
 * @author clxud
 */
public class Main { 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Inventory store = new Inventory();
        int choice;

        do {
            System.out.println("STORE INVENTORY MENU");
            System.out.println("1.Add product");
            System.out.println("2. Display inventory");
            System.out.println("3. Search product");
            System.out.println("4. Update quantity");
            System.out.println("5. Delete qroduct");
            System.out.println("6. Total inventory value");
            System.out.println("7. exit");
            System.out.print("enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("enter product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("enter product name:");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    store.addProduct(id, name, quantity, price);
                    break;

                case 2:
                    store.displayInventory();
                    break;

                case 3:
                    System.out.print("Enter product ID to search: ");
                    store.searchProductById(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter product ID: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    store.updateQuantity(updateId, newQty);
                    break;

                case 5:
                    System.out.print("enter product ID to delete: ");
                    store.deleteProduct(sc.nextInt());
                    break;

                case 6:
                    store.calculateTotalValue();
                    break;

                case 7:
                    System.out.println("exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}    
