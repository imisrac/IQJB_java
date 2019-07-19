package command;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequencyOperation extends DictionaryOperationImpl {
    @Override
    public Map execute() {
        return lines.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
}
