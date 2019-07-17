package compozit;

import visitor.Visitor;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Node {

    static int LEVEL = 0;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    String draw() {
        return IntStream.range(0, LEVEL).mapToObj(operand -> "----").collect(Collectors.joining()) + name;
    }

    abstract void accept(Visitor visitor);

}
