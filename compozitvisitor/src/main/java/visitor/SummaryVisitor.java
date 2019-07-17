package visitor;

import compozit.Directory;
import compozit.RegularFile;

public class SummaryVisitor implements Visitor {

    int sum = 0;

    @Override
    public void visit(Directory directory) {
    }

    @Override
    public void visit(RegularFile regularFile) {
        sum += regularFile.getSize();
    }

    public int getSum() {
        return sum;
    }
}
