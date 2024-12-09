import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс, представляющий библиотеку, которая хранит книги в HashMap с их id.
 */
public class Library {
    private Map<Integer, Book> books;

    /**
     * Конструктор для создания объекта библиотеки.
     */
    public Library() {
        this.books = new HashMap<>();
    }

    /**
     * Добавляет книгу в библиотеку.
     *
     * @param book Объект книги
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Книга не может быть null");
        }
        books.put(book.getId(), book);
    }

    /**
     * Удаляет книгу из библиотеки по её id.
     *
     * @param id Уникальный идентификатор книги
     */
    public void removeBook(int id) {
        books.remove(id);
    }

    /**
     * Возвращает книгу по её id.
     *
     * @param id Уникальный идентификатор книги
     * @return Объект книги или null, если книга не найдена
     */
    public Book getBook(int id) {
        return books.get(id);
    }

    /**
     * Возвращает копию HashMap со всеми книгами в библиотеке.
     *
     * @return Копия HashMap со всеми книгами
     */
    public Map<Integer, Book> getAllBooks() {
        return new HashMap<>(books);
    }

    /**
     * Выводит все книги в библиотеке на экран.
     */
    public void printAllBooks() {
        books.values().forEach(System.out::println);
    }

    /**
     * Возвращает список всех книг с сортировкой по названию.
     *
     * @return Список книг, отсортированный по названию
     */
    public List<Book> getBooks() {
        return books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Возвращает список книг с сортировкой по названию, отфильтрованный по доступности.
     *
     * @param available true для доступных книг, false для недоступных
     * @return Список книг, отсортированный по названию и отфильтрованный по доступности
     */
    public List<Book> getBooks(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Возвращает количество всех книг в библиотеке.
     *
     * @return Количество всех книг
     */
    public long getTotalBooksCount() {
        return books.size();
    }

    /**
     * Возвращает количество доступных или недоступных книг в библиотеке.
     *
     * @param available true для доступных книг, false для недоступных
     * @return Количество доступных или недоступных книг
     */
    public long getBooksCount(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .count();
    }

    /**
     * Возвращает список авторов, без дубликатов и отсортированный по алфавиту.
     *
     * @return Список авторов
     */
    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Возвращает список книг с сортировкой по заданному компаратору.
     *
     * @param comparator Компаратор для сортировки книг
     * @return Список книг, отсортированный по заданному компаратору
     */
    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    /**
     * Возвращает список книг с сортировкой по заданному компаратору и фильтрацией по доступности.
     *
     * @param comparator Компаратор для сортировки книг
     * @param available  true для доступных книг, false для недоступных
     * @return Список книг, отсортированный по заданному компаратору и отфильтрованный по доступности
     */
    public List<Book> getBooks(Comparator<Book> comparator, boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}