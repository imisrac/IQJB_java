package compozit;

import visitor.Visitor;

public class RegularFile extends Node {

    private int size;

    public RegularFile(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    String draw() {
        return super.draw();
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getSize() {
        return size;
    }
}
