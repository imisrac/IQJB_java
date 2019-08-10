package command;

import com.google.common.collect.ImmutableMap;


public class CaracterCountingOperation extends DictionaryOperationImpl {


    @Override
    public ImmutableMap<String, Integer> execute() {
        return ImmutableMap.of("numberOfChars", lines.stream()
                .mapToInt(String::length)
                .sum());
    }
}
