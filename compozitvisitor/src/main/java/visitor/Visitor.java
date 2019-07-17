package visitor;

import compozit.Directory;
import compozit.RegularFile;

public interface Visitor {
    void visit(Directory directory);

    void visit(RegularFile regularFile);
}
