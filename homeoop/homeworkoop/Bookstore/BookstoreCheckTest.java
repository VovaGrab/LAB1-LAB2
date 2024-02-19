class BookstoreCheckUnit {
    public static void main(String[] args) {
        // Testare metoda areBooksDuplicate
        Book book1 = new Book("Titlu", "Autor", "Editura", 200);
        Book book2 = new Book("Titlu", "Autor", "Editura", 250);
        Book book3 = new Book("Alt titlu", "Alt autor", "Altă editură", 200);

        System.out.println("Are cărțile duplicate? " + BookstoreCheck.areBooksDuplicate(book1, book2)); // true
        System.out.println("Are cărțile duplicate? " + BookstoreCheck.areBooksDuplicate(book1, book3)); // false

        // Testare metoda getThickerBook
        Book thickerBook = BookstoreCheck.getThickerBook(book1, book2);
        System.out.println("Cartea mai groasă: " + thickerBook.getTitle() + " cu " + thickerBook.getPageCount() + " pagini.");
    }

    static class BookstoreCheck {
        public static boolean areBooksDuplicate(Book book1, Book book2) {
            return book1.getTitle().equals(book2.getTitle()) && book1.getAuthor().equals(book2.getAuthor());
        }

        public static Book getThickerBook(Book book1, Book book2) {
            if (book1.getPageCount() > book2.getPageCount()) {
                return book1;
            } else {
                return book2;
            }
        }
    }
}
