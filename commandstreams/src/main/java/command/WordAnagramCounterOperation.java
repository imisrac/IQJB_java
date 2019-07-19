package command;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAnagramCounterOperation extends DictionaryOperationImpl {
    @Override
    public Map execute() {
        return lines.stream().collect(Collectors.toMap(o -> o, this::anagramsOf));
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
