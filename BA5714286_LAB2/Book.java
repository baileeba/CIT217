/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.two;

/**
 *
 * @author clxud
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    //default constructor
    public Book(){
        title = "";
        author = "";
        price = 0.0;
    }
    
    //constructor

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    //copy
    public Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
    }
    
    //getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    
    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //toString method
    @Override
    public String toString(){
        return "title: " + title + ", author: " + author + ", price: $" + price;
    }
}
