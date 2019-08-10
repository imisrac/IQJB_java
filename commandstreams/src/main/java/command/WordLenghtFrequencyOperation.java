package command;

import java.util.Map;
import java.util.stream.Collectors;


public class WordLenghtFrequencyOperation extends DictionaryOperationImpl {

	@Override
	public Map<Integer, Long> execute() {
		return lines.collect(Collectors.groupingBy(String::length, Collectors.counting()));
	}
}
