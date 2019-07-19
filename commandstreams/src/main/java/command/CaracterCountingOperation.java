package command;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class CaracterCountingOperation extends DictionaryOperationImpl {


    @Override
    public Map execute() {
        return ImmutableMap.of("sum", lines.stream()
                .mapToInt(String::length)
                .sum());
    }
}
