package accumulation;

public class Even implements Predicate {
    @Override
    public boolean test(int init) {
        return init % 2 == 0;
    }
}
