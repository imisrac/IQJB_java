package accumulation;

public class Multiply implements Operation {
    @Override
    public int operate(int init, int value) {
        return init * value;
    }
}
