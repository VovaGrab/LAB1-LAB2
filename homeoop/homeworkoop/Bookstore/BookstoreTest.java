import java.util.Scanner;

public class BookstoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea datelor de la tastatură
        System.out.println("Introduceți titlul cărții:");
        String title = scanner.nextLine();

        System.out.println("Introduceți numele autorului:");
        String author = scanner.nextLine();

        System.out.println("Introduceți numele editurii:");
        String publisher = scanner.nextLine();

        System.out.println("Introduceți numărul de pagini:");
        int pageCount = scanner.nextInt();

        // Crearea unui obiect de tip Book
        Book book = new Book(title, author, publisher, pageCount);

        // Afisarea informatiilor despre carte
        System.out.println("Informații despre carte:");
        System.out.println("Titlu: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Editură: " + book.getPublisher());
        System.out.println("Număr de pagini: " + book.getPageCount());
    }
}
