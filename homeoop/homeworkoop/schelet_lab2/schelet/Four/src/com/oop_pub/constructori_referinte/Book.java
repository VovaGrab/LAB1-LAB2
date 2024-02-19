import java.io.*;
import java.util.*;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

    public static void main(String[] args) {
        // Crearea unei cărți și afișarea detaliilor folosind metoda toString()
        Book book1 = new Book("amintiri din copilarie", "ion creanga", 2002);
        System.out.println("Book details:");
        System.out.println(book1.toString());
    }
}
