package command;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class WordLenghtOperation extends DictionaryOperationImpl {
    @Override
    public Map execute() {
        return ImmutableMap.of("shortest", getShortestWordLength(),
                "longest", getLongestWordLength(),
                "average", getAverageWordLength());
    }

    private double getAverageWordLength() {
        return lines.stream()
                .mapToInt(String::length)
                .average()
                .orElseThrow(RuntimeException::new);
    }

    private int getLongestWordLength() {
        return lines.stream()
                .mapToInt(String::length)
                .max()
                .orElseThrow(RuntimeException::new);
    }

    private int getShortestWordLength() {
        return lines.stream()
                .mapToInt(String::length)
                .min()
                .orElseThrow(RuntimeException::new);
    }
}
