package command;

import com.google.common.collect.ImmutableMap;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;


public class WordLenghtOperation extends DictionaryOperationImpl {

	@Override
	public ImmutableMap<String, Number> execute() {
		return ImmutableMap.of("min", getSummary().getMin(), "max", getSummary().getMax(), "avg", getSummary().getAverage());

		//        return ImmutableMap.of("min", getShortestWordLength(),
		//                "max", getLongestWordLength(),
		//                "avg", getAverageWordLength());
	}

	private IntSummaryStatistics getSummary() {
		return lines.collect(Collectors.summarizingInt(String::length));
	}

	private double getAverageWordLength() {
		return lines.mapToInt(String::length)
				.average()
				.orElseThrow(RuntimeException::new);
	}

	private int getLongestWordLength() {
		return lines.mapToInt(String::length)
				.max()
				.orElseThrow(RuntimeException::new);
	}

	private int getShortestWordLength() {
		return lines.mapToInt(String::length)
				.min()
				.orElseThrow(RuntimeException::new);
	}
}
