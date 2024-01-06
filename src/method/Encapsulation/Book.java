package method.Encapsulation;

import java.util.Scanner;

public class Book {
    private int ID;
    private String bookName;
    private String Author;
    private String Publisher;
    private int Price;

    public void set(int id,String name,String author,String publisher,int price){

        ID = id;
        bookName = name;
        Author = author;
        Publisher = publisher;
        Price = price;
    }
    public void get(){
        System.out.println("bookName: " + bookName + " ,Author: " + Author + " ,Publisher: "
                + Publisher + " ,Price: " + Price);
    }

    public int getID() {
        return ID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", bookName='" + bookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Price=" + Price +
                '}';
    }


}
