package exercise4.objects;

/**
 * Created by Виктория on 26.09.16.
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public String toString() {
        return "Book title:" + title + ", book author:" + author + ", book price:" + price + ", book edition" + edition;
    }

    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (object == null) { return false; }
        if (object.getClass() != Book.class) { return false; }

        Book book = (Book) object;

        if (price != book.price) { return false; }
        if (null == title){
            return title == book.title;
        } else {
            if (!title.equals(book.title)) { return false; } }
        if (null == author){
            return author == book.author;
        } else {
            if (!author.equals(book.author)) { return false; } }
        return true;
    }

    public int hashCode() {
        return (int)(31 * price + ((null == title) ? 0 : title.hashCode()) + ((null == author) ? 0 : author.hashCode()));
    }


}
