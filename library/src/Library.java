public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";

        Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseYear = 1911;
        book1.pages = 320;
        book1.publisher = "Wydawnictwo Greg";
        book1.isbn = "978-83-66462-81-6";
        String bookDesc = book1.title + ", " + book1.author + ", " + book1.releaseYear + ", " + book1.pages + "s, " +
                book1.publisher + ", " + book1.isbn;

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        System.out.println(bookDesc);
    }
}
