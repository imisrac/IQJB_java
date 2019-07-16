import java.time.LocalDateTime;

public class Book extends LibraryItem {

    private String author;
    private String title;
    private LocalDateTime dateOfPublication;

    Book(int numberOfCopies, String author, String title, LocalDateTime dateOfPublication) {
        super(numberOfCopies);
        this.author = author;
        this.title = title;
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfCopies=" + super.getNumberOfCopies() +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                '}';
    }
}
