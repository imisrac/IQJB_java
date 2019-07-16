import java.util.HashSet;
import java.util.Set;

public class LibraryItemInfo {

    private LibraryItem libraryItem;
    private Set<String> registry = new HashSet<>();

    public LibraryItemInfo(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }

    public void borrowItem(String name) {
        registry.add(name);
        libraryItem.setNumberOfCopies(libraryItem.getNumberOfCopies() - 1);
    }

    public void returnItem(String name) {
        registry.remove(name);
        libraryItem.setNumberOfCopies(libraryItem.getNumberOfCopies() + 1);
    }

    @Override
    public String toString() {
        return "LibraryItemInfo{" +
                "libraryItem=" + libraryItem +
                ", registry=" + registry +
                '}';
    }
}
