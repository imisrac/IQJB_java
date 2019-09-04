package command;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.stream.Collectors;


public class WordAnagramCounterOperation extends DictionaryOperationImpl {

	private String word;

	public WordAnagramCounterOperation(String word) {
		this.word = word;
	}

	@Override
	public ImmutableMap<String, List<String>> execute() {
		String ordered = order(word);
		return ImmutableMap.of(word, lines.filter(s -> ordered.equals(order(s)))
				.collect(Collectors.toList()));
	}

	private String order(String word) {
		return word.chars()
				.sorted()
				.mapToObj(String::valueOf)
				.collect(Collectors.joining());
	}
}
