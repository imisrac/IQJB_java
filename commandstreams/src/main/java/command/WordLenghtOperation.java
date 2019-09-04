package command;

import com.google.common.collect.ImmutableMap;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class WordLenghtOperation extends DictionaryOperationImpl {

	List<String> words;

	public WordLenghtOperation() {
		this.words = lines.collect(Collectors.toList());
	}

	@Override
	public ImmutableMap<String, Number> execute() {
		//		final IntSummaryStatistics summary = getSummary();
		//		return ImmutableMap.of("min", summary.getMin(), "max", summary.getMax(), "avg", summary.getAverage());

		return ImmutableMap.of("min", getShortestWordLength(),
				"max", getLongestWordLength(),
				"avg", getAverageWordLength());
	}

	private IntSummaryStatistics getSummary() {
		return lines.collect(Collectors.summarizingInt(String::length));
	}

	private double getAverageWordLength() {
		return words.stream().mapToInt(String::length)
				.average()
				.orElseThrow(RuntimeException::new);
	}

	private int getLongestWordLength() {
		return words.stream().mapToInt(String::length)
				.max()
				.orElseThrow(RuntimeException::new);
	}

	private int getShortestWordLength() {
		return words.stream().mapToInt(String::length)
				.min()
				.orElseThrow(RuntimeException::new);
	}
}
