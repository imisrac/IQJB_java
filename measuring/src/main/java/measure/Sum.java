package measure;

public class Sum {

    private long sum = 0L;

    synchronized void add(long number) {
        sum += number;
    }

    public long getSum() {
        return sum;
    }
}
