package builder1;

public abstract class ComputerPart {

    private String attribute;

    protected ComputerPart(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}
