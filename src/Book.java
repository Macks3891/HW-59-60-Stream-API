/**
 * Класс, представляющий книгу.
 */
public class Book {
    private final int id;
    private String title;
    private String author;
    private boolean isAvailable;

    /**
     * Конструктор для создания объекта книги.
     *
     * @param id         Уникальный идентификатор книги
     * @param title      Название книги
     * @param author     Автор книги
     * @param isAvailable Доступность книги для получения
     */
    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    /**
     * Возвращает уникальный идентификатор книги.
     *
     * @return Уникальный идентификатор книги
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает название книги.
     *
     * @return Название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Устанавливает название книги.
     *
     * @param title Название книги
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Возвращает автора книги.
     *
     * @return Автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Устанавливает автора книги.
     *
     * @param author Автор книги
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Проверяет, доступна ли книга для получения.
     *
     * @return true, если книга доступна, иначе false
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Устанавливает доступность книги для получения.
     *
     * @param available true, если книга доступна, иначе false
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Возвращает строковое представление книги.
     *
     * @return Строковое представление книги
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}