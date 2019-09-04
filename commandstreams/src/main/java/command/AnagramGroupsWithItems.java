package command;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AnagramGroupsWithItems extends DictionaryOperationImpl {

	private Integer numberOfItems;

	public AnagramGroupsWithItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	@Override
	public Map<Integer, List<String>> execute() {
		return ImmutableMap.of(numberOfItems, lines.map(this::anagramsOf)
				.collect(Collectors.groupingBy(List::size)));
	}

	private List<String> anagramsOf(String word) {
		String ordered = order(word);
		return lines.filter(s -> ordered.equals(order(s)))
				.collect(Collectors.toList());
	}

	private String order(String word) {
		return word.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
	}
}
