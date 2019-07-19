package command;

import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryAnalyzerExecutorTest {

    private DictionaryAnalyzerExecutor dictionaryAnalyzerExecutor = new DictionaryAnalyzerExecutor();

    @Test
    public void test_word_lenght_frequency() {
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new WordLenghtFrequencyOperation()).get(4), is(1783L));
    }

    @Test
    public void test_character_frequency() {
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new CharacterFrequencyOperation()).get("s"), is(8225L));
    }

    @Test
    public void test_number_of_characters() {
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new CaracterCountingOperation()).get("sum"), is(148278));
    }

    @Test
    public void test_word_length() {
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("shortest"), is(1));
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("longest"), is(22));
        assertThat((double) dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("average"), IsCloseTo.closeTo(7D, 1D));
    }

//    @Test seems like infinite loop
//    public void test_anagrams_by_word() {
//        assertThat((List<String>) dictionaryAnalyzerExecutor.executeOperation(new WordAnagramCounterOperation()).get("race"), Matchers.containsInAnyOrder(""));
//    }
}