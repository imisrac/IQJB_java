public abstract class LibraryItem {

    private int numberOfCopies;

    LibraryItem(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "numberOfCopies=" + numberOfCopies +
                '}';
    }

    int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
