package accumulation;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Predicate;

class LambdaAccumulation {

    private int[] pool = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int accumulate(int init, BiFunction<Integer, Integer, Integer> function, Predicate<Integer> predicate) {
        return Arrays.stream(pool)
                .filter(predicate::test)
                .map(operand -> function.apply(init, operand))
                .sum();
    }
}
