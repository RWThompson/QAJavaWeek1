/**
 * Created by Administrator on 10/08/2017.
 */
public class Book extends Resource{

    private String genre;
    private int numPages;
    private String publisher;
    private String isbn;

    public Book(String n, String a, boolean b) {
        super(n, a, b);
    }

    public Book(String n, String a, boolean b, String g, int np, String pub, String i) {
        super(n, a, b);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "Book, " + name + ", " + author + ", " + isAvailable + ", " + genre + ", " + numPages + ", " + publisher + ", " + isbn;
    }
}
