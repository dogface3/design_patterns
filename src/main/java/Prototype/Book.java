package Prototype;

public class Book implements Cloneable {

    String author;
    String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        return book;
    }
}
