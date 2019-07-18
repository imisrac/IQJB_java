package accumulation;

class Accumulation {

    private int[] pool = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Accumulation() {
    }

    int accumulate(int init) {
        for (int value : pool) {
            init += value;
        }
        return init;
    }

    int accumulate(int init, Operation operation) {
        for (int value : pool) {
            init = operation.operate(init, value);
        }
        return init;
    }

    int accumulate(int init, Operation operation, Predicate predicate) {
        for (int value : pool) {
            if (predicate.test(value)) {
                init = operation.operate(init, value);
            }
        }
        return init;
    }
}
