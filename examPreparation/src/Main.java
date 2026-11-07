import Library.Author;
import Library.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int total = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testLibrary();
        testAddBook();
        testAddAuthor();
        testAuthorConstructor();
        testBookConstructor();
        testSetBooks();
        testSetAuthors();
        testRemoveBook();
        testRemoveAuthor();
        testGettersReturnCopies();

        System.out.println();
        System.out.println("Пройдено " + (total - failed) + " из " + total);
    }

    private static void testLibrary() {
        Author tolstoy = new Author("Leo Tolstoy");
        Author dostoevsky = new Author("Fyodor Dostoevsky");
        Author bulgakov = new Author("Mikhail Bulgakov");
        Author orwell = new Author("George Orwell");
        Author ilf = new Author("Ilya Ilf");
        Author petrov = new Author("Evgeny Petrov");
        Author gaiman = new Author("Neil Gaiman");
        Author pratchett = new Author("Terry Pratchett");
        Author unpublished = new Author("Unpublished Library.Author");

        Book warAndPeace = new Book("War and Peace", List.of(tolstoy));
        Book annaKarenina = new Book("Anna Karenina", List.of(tolstoy));
        Book crimeAndPunishment = new Book("Crime and Punishment", List.of(dostoevsky));
        Book masterAndMargarita = new Book("The Master and Margarita", List.of(bulgakov));
        Book nineteenEightyFour = new Book("1984", List.of(orwell));
        Book americanGods = new Book("American Gods", List.of(gaiman));
        Book twelveChairs = new Book("The Twelve Chairs", List.of(ilf, petrov));
        Book goldenCalf = new Book("The Golden Calf", List.of(ilf, petrov));
        Book goodOmens = new Book("Good Omens", List.of(gaiman, pratchett));
        Book anonymous = new Book("Anonymous Manuscript", List.of());

        List<Author> authors = List.of(
                tolstoy, dostoevsky, bulgakov, orwell, ilf, petrov, gaiman, pratchett, unpublished
        );
        List<Book> library = List.of(
                warAndPeace, annaKarenina, crimeAndPunishment, masterAndMargarita,
                nineteenEightyFour, americanGods, twelveChairs, goldenCalf,
                goodOmens, anonymous
        );

        section("Книга и её авторы");
        check("У книги с одним автором ровно 1 автор", names(warAndPeace), List.of("Leo Tolstoy"));
        check("У книги с двумя авторами ровно 2 автора", names(twelveChairs), List.of("Ilya Ilf", "Evgeny Petrov"));
        check("Порядок авторов как в List.of", names(goodOmens), List.of("Neil Gaiman", "Terry Pratchett"));
        check("У книги без авторов пустой список", names(anonymous), List.of());

        section("Автор и его книги");
        check("У Tolstoy 2 книги", titles(tolstoy), List.of("War and Peace", "Anna Karenina"));
        check("У Ilf обе совместные книги", titles(ilf), List.of("The Twelve Chairs", "The Golden Calf"));
        check("У Petrov те же книги, что у Ilf", titles(petrov), titles(ilf));
        check("У Gaiman книга в одиночку и книга в соавторстве", titles(gaiman), List.of("American Gods", "Good Omens"));
        check("У автора без книг пустой список", titles(unpublished), List.of());
        check("Связи согласованы в обе стороны", linksConsistent(authors, library), true);
    }

    private static void testAddBook() {
        section("Library.Author.addBook");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A");
        author.addBook(book);
        author.addBook(book);
        check("Повторный addBook не дублирует книгу", titles(author), List.of("Library.Book A"));
        check("addBook добавляет автора книге", names(book), List.of("Library.Author A"));
    }

    private static void testAddAuthor() {
        section("Library.Book.addAuthor");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A");
        book.addAuthor(author);
        book.addAuthor(author);
        check("Повторный addAuthor не дублирует автора", names(book), List.of("Library.Author A"));
        check("addAuthor добавляет книгу автору", titles(author), List.of("Library.Book A"));
    }

    private static void testAuthorConstructor() {
        section("Конструктор Library.Author(name, books)");
        Book book = new Book("Library.Book A");
        Author author = new Author("Library.Author A", List.of(book, book));
        check("Книга получает автора", names(book), List.of("Library.Author A"));
        check("Повтор книги в списке не создаёт дубль", titles(author), List.of("Library.Book A"));
    }

    private static void testBookConstructor() {
        section("Конструктор Library.Book(title, authors)");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A", List.of(author, author));
        check("Автор получает книгу", titles(author), List.of("Library.Book A"));
        check("Повтор автора в списке не создаёт дубль", names(book), List.of("Library.Author A"));
    }

    private static void testSetBooks() {
        section("Library.Author.setBooks");
        Author author = new Author("Library.Author A");
        Author coAuthor = new Author("Co-Library.Author");
        Book oldBook = new Book("Old Library.Book", List.of(author, coAuthor));
        Book newBook = new Book("New Library.Book");
        List<Book> external = new ArrayList<>(List.of(newBook));

        author.setBooks(external);
        external.clear();

        check("У автора только новые книги", titles(author), List.of("New Library.Book"));
        check("Новая книга получает автора", names(newBook), List.of("Library.Author A"));
        check("Старая книга теряет автора", names(oldBook), List.of("Co-Library.Author"));
        check("Соавтор сохраняет старую книгу", titles(coAuthor), List.of("Old Library.Book"));
    }

    private static void testSetAuthors() {
        section("Library.Book.setAuthors");
        Author oldAuthor = new Author("Old Library.Author");
        Author newAuthor = new Author("New Library.Author");
        Book book = new Book("Library.Book A", List.of(oldAuthor));
        List<Author> external = new ArrayList<>(List.of(newAuthor));

        book.setAuthors(external);
        external.clear();

        check("У книги только новые авторы", names(book), List.of("New Library.Author"));
        check("Новый автор получает книгу", titles(newAuthor), List.of("Library.Book A"));
        check("Старый автор теряет книгу", titles(oldAuthor), List.of());
    }

    private static void testRemoveBook() {
        section("Library.Author.removeBook");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A", List.of(author));
        author.removeBook(book);
        check("Книга удалена у автора", titles(author), List.of());
        check("Автор удалён у книги", names(book), List.of());
    }

    private static void testRemoveAuthor() {
        section("Library.Book.removeAuthor");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A", List.of(author));
        book.removeAuthor(author);
        check("Автор удалён у книги", names(book), List.of());
        check("Книга удалена у автора", titles(author), List.of());
    }

    private static void testGettersReturnCopies() {
        section("Геттеры возвращают копии");
        Author author = new Author("Library.Author A");
        Book book = new Book("Library.Book A", List.of(author));
        author.getBooks().clear();
        book.getAuthors().clear();
        check("Очистка результата getBooks не меняет автора", titles(author), List.of("Library.Book A"));
        check("Очистка результата getAuthors не меняет книгу", names(book), List.of("Library.Author A"));
    }

    private static List<String> titles(Author author) {
        return author.getBooks().stream().map(Book::getTitle).toList();
    }

    private static List<String> names(Book book) {
        return book.getAuthors().stream().map(Author::getName).toList();
    }

    private static boolean linksConsistent(List<Author> authors, List<Book> books) {
        for (Author a : authors) {
            for (Book b : a.getBooks()) {
                if (!b.getAuthors().contains(a)) return false;
            }
        }
        for (Book b : books) {
            for (Author a : b.getAuthors()) {
                if (!a.getBooks().contains(b)) return false;
            }
        }
        return true;
    }

    private static void section(String title) {
        System.out.println();
        System.out.println("===== " + title + " =====");
    }

    private static void check(String description, Object actual, Object expected) {
        total++;
        boolean ok = expected.equals(actual);
        if (!ok) failed++;
        System.out.printf("%2d. %-6s %s%n", total, ok ? "OK" : "ОШИБКА", description);
        if (!ok) {
            System.out.println("            ожидалось: " + expected + ", получено: " + actual);
        }
    }
}
