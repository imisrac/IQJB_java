package command;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAnagramCounterOperation extends DictionaryOperationImpl {

    private String word;

    public WordAnagramCounterOperation(String word) {
        this.word = word;
    }

    @Override
    public Map execute() {
        return ImmutableMap.of(word, anagramsOf(word));
    }

    private List<String> anagramsOf(String word) {
        String ordered = order(word);
        return lines.stream()
                .filter(s -> ordered.equals(order(s)))
                .collect(Collectors.toList());
    }

    private String order(String word) {
        return word.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
    }
}
