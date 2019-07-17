package visitor;

import compozit.Directory;
import compozit.RegularFile;

public class CountingVisitor implements Visitor {

    private int count = 0;

    @Override
    public void visit(Directory directory) {
        count += 1;
    }

    @Override
    public void visit(RegularFile regularFile) {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
