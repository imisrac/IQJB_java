import java.time.LocalDateTime;

public class Film extends LibraryItem {

    private String director;
    private String title;
    private LocalDateTime playTime;

    public Film(int numberOfCopies, String director, String title, LocalDateTime playTime) {
        super(numberOfCopies);
        this.director = director;
        this.title = title;
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "Film{" +
                "numberOfCopies=" + super.getNumberOfCopies() +
                ", director='" + director + '\'' +
                ", title='" + title + '\'' +
                ", playTime='" + playTime + '\'' +
                '}';
    }
}
