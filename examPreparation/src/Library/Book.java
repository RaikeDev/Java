package Library;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private List<Author> authors;
    private String title;

    public Book(String title, List<Author> authors){
        this.title = title;
        this.authors = new ArrayList<>(authors);
        authors.forEach(a -> a.addBook(this));
    }

    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
    }

    public List<Author> getAuthors() {
        return new ArrayList<>(authors);
    }

    public void setAuthors(List<Author> authors) {
        this.authors = new ArrayList<>(authors);
        for (Author a:this.authors){
            if (!a.getBooks().contains(this)){
                a.addBook(this);
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public void addAuthor(Author a){
        if (!getAuthors().contains(a)){
            List<Author> aList = new ArrayList<>(getAuthors());
            aList.add(a);
            setAuthors(aList);
        }
    }

    public void removeAuthor(Author a){
        if (getAuthors().contains(a)){
            authors.remove(a);
        }
    }

    @Override
    public String toString(){
        List<Author> authorList = getAuthors();
        if (authorList.size() <= 0) return "Нет такой книги";
        List<String> authorNames = new ArrayList<>();
        for (Author a:authorList){
            authorNames.add(a.getName());
        }

        if (authorList.size() == 1) return "Название книги: " + getTitle() + ",  Автор книги: " + authorList.getFirst().getName();

        return "Название книги: " + getTitle() + ",  Авторы книги: " + authorNames;
    }

}
