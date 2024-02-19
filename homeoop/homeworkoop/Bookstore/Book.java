import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        setPageCount(pageCount); // Validare număr de pagini
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Numărul de pagini trebuie să fie mai mare decât zero...");
        }
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        // Formatarea afișării conform cerințelor
        return "BOOK_TITLE: " + title.toUpperCase() +
                " BOOK_AUTHOR: " + author +
                " BOOK_PUBLISHER: " + publisher.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, pageCount);
    }

    public static void main(String[] args) {
        // Inițializare informațiilor despre carte
        String title = "Sianie"
        String author = "S.King";
        String publisher = "10000001";
        int pageCount = 356;

        // Crearea și inițializarea unui obiect de tip Book
        Book book = new Book(title, author, publisher, pageCount);

        // Afișarea informațiilor despre carte
        System.out.println("Informații despre carte:");
        System.out.println(book);
    }
}
