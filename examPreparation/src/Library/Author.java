package Library;

import java.util.List;
import java.util.ArrayList;

public class Author {
    private List<Book> books;
    private String name;

    public Author(String name, List<Book> books){
        this.name = name;
        this.books = new ArrayList<>(books);
        books.forEach(book -> book.addAuthor(this));
    }
    public Author(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void setBooks(List<Book> books) {
        for (Book b: getBooks()){
            removeBook(b);
        }
        for(Book b: books){
            addBook(b);
        }

    }

    public void removeBook(Book b) {
        if (books.remove(b)){
            b.removeAuthor(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        if (!getBooks().contains(book)){
            books.add(book);
            book.addAuthor(this);
        }
    }


    @Override
    public String toString(){
        if (getBooks().isEmpty()){
            return "Автор: " + getName() + ", Нет книг";
        }
        List<String> bookNames = new ArrayList<>();
        for(Book b: getBooks()){
            bookNames.add(b.getTitle());
        }
        return "Автор: " + getName() + ", Книги: " + bookNames;

    }
}
