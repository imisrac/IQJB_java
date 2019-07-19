package measure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Measure {

    static long sum1(long number) {
        long result = 0L;
        for (int i = 1; i <= number; i++) {
            result += i;
        }

        return result;
    }

    static long sum2(long number) {
        return Stream.iterate(1L, aLong -> aLong + 1)
                .limit(number)
                .reduce(Long::sum)
                .get();
    }

    static long sum2b(long number) {
        return Stream.iterate(1L, aLong -> aLong + 1)
                .limit(number)
                .parallel()
                .reduce(Long::sum)
                .get();
    }

    static long sum3(long number) {
        Sum sum = new Sum();
        LongStream.rangeClosed(1, number)
                .forEach(sum::add);
        return sum.getSum();
    }

    static long sum3b(long number) {
        Sum sum = new Sum();
        LongStream.rangeClosed(1, number)
                .parallel()
                .forEach(sum::add);
        return sum.getSum();
    }

    <T, R> long measure(Function<T, R> function, T arg) {
        List<Long> executionTimes = new ArrayList<>();
        IntStream.rangeClosed(0, 10).forEach(value -> {
            long startTime = System.currentTimeMillis();
            function.apply(arg);
            long endTime = System.currentTimeMillis();
            executionTimes.add(endTime - startTime);
        });

        return executionTimes.stream().mapToLong(Long::longValue).min().getAsLong();
    }
}
