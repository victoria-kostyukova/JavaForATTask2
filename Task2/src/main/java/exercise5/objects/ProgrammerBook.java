package exercise5.objects;

import exercise4.objects.Book;

/**
 * Created by Viktoryia_Kastsiukov on 10/4/2016.
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null) { return false; }
        if (o.getClass() != Book.class) { return false; }

        ProgrammerBook book = (ProgrammerBook) o;

        if (level != book.level) { return false; }
        if (null == language){
            return language == book.language;
        } else {
            if (!language.equals(book.language)) { return false; } }

        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31 * level + ((null == language) ? 0 : language.hashCode()));
    }

    @Override
    public String toString() {
        return "Programmer book language:" + language + ", programmer book level:" + level;
    }
}
