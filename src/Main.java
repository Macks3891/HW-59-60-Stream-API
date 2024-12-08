import java.util.Comparator;
import java.util.List;

/**
 * Главный класс для демонстрации работы с библиотекой.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book(1, "1984", "Джордж Оруэлл", true));
        library.addBook(new Book(2, "Убить пересмешника", "Харпер Ли", false));
        library.addBook(new Book(3, "Великий Гэтсби", "Ф. Скотт Фицджеральд", true));
        library.addBook(new Book(4, "Гордость и предубеждение", "Джейн Остин", false));
        library.addBook(new Book(5, "Над пропастью во ржи", "Джером Д. Сэлинджер", true));


        System.out.println("Все книги в библиотеке:");
        library.printAllBooks();


        Book book = library.getBook(2);
        System.out.println("Книга с ID 2: " + book);


        library.removeBook(3);


        System.out.println("Все книги в библиотеке после удаления:");
        library.printAllBooks();


        List<Book> sortedBooks = library.getBooks();
        System.out.println("Книги, отсортированные по названию:");
        sortedBooks.forEach(System.out::println);


        List<Book> availableBooks = library.getBooks(true);
        System.out.println("Доступные книги, отсортированные по названию:");
        availableBooks.forEach(System.out::println);


        long totalBooksCount = library.getTotalBooksCount();
        System.out.println("Общее количество книг: " + totalBooksCount);


        long availableBooksCount = library.getBooksCount(true);
        System.out.println("Количество доступных книг: " + availableBooksCount);


        List<String> authors = library.getAuthors();
        System.out.println("Авторы, отсортированные по алфавиту:");
        authors.forEach(System.out::println);


        List<Book> booksByAuthor = library.getBooks(Comparator.comparing(Book::getAuthor));
        System.out.println("Книги, отсортированные по автору:");
        booksByAuthor.forEach(System.out::println);


        List<Book> availableBooksByAuthor = library.getBooks(Comparator.comparing(Book::getAuthor), true);
        System.out.println("Доступные книги, отсортированные по автору:");
        availableBooksByAuthor.forEach(System.out::println);
    }
}