package compozit1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory extends Node {

    private List<Node> nodes = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    void addSubNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getSubNodes() {
        return nodes;
    }

    void removeNode(Node node) {
        nodes.remove(node);
    }

    @Override
    String draw() {
        String tree = super.draw();
        if (!nodes.isEmpty()) {
            LEVEL += 1;
            tree += "\n" + nodes.stream().map(Node::draw).collect(Collectors.joining("\n"));
            LEVEL -= 1;
        }
        return tree;
    }
}
