package exercise4.objects;

/**
 * Created by Виктория on 26.09.16.
 */
public class Book implements Cloneable, Comparable{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book title:" + title + ", book author:" + author + ", book price:" + price + ", book edition" + edition;
    }

    @Override
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

    @Override
    public int hashCode() {
        return (int)(31 * price + ((null == title) ? 0 : title.hashCode()) + ((null == author) ? 0 : author.hashCode()));
    }

    @Override
    public Book clone(){
        return new Book(new String (this.title), new String (this.author), this.price, this.isbn);
    }

    public int compareTo(Object o) {
        int res = 0;
        if (this.isbn < ((Book) o).isbn){
            res =  -1;
        } else if (this.isbn > ((Book) o).isbn){
            res =  1;
        } else if (this.isbn == ((Book) o).isbn){
            res =  0;
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public static int getEdition() {
        return edition;
    }
}
