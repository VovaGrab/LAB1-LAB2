public class Main {
    public static void main(String[] args) {
        // Inițializare informațiilor despre carte
        String title = "Java Programming";
        String author = "John Doe";
        String publisher = "Tech Publishing";
        int pageCount = 300;

        // Crearea și inițializarea unui obiect de tip Book
        Book book = new Book(title, author, publisher, pageCount);

        // Afișarea informațiilor despre carte
        System.out.println("Informații despre carte:");
        System.out.println(book);
    }
}
