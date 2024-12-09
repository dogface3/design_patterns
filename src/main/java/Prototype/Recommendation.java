package Prototype;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Recommendation implements Cloneable{
    List<Book> bookList;

    String targetAudience;

    public Recommendation(String targetAudience){
        this.bookList = new ArrayList<>();
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public void changeAudience(String audience){
        this.targetAudience = audience;
    }

    public void delBook(String title) {
        Iterator<Book> iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
            }
        }
    }
    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.bookList = new ArrayList<>();
            for (Book book : this.bookList) {
                clonedRecommendation.addBook(book);
            };
            return clonedRecommendation;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
