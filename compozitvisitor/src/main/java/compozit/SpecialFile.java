package compozit;

public class SpecialFile extends RegularFile {

    private String attribute;

    public SpecialFile(String name, int size, String attribute) {
        super(name, size);
        this.attribute = attribute;
    }
}
