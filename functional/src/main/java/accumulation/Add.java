package accumulation;

public class Add implements Operation {
    @Override
    public int operate(int init, int value) {
        return init + value;
    }
}
