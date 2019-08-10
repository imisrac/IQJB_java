package command;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;


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
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new CaracterCountingOperation()).get("numberOfChars"), is(148278));
    }

    @Test
    public void test_word_length() {
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("min"), is(1));
        assertThat(dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("max"), is(22));
        assertThat((double) dictionaryAnalyzerExecutor.executeOperation(new WordLenghtOperation()).get("avg"), Matchers.closeTo(7D, 1D));
    }

    @Test
    public void test_anagrams_by_word() {
        assertThat((List) dictionaryAnalyzerExecutor.executeOperation(new WordAnagramCounterOperation("race")).get("race"),
                Matchers.containsInAnyOrder(Arrays.asList("acre", "care", "race")));
    }

    //    @Test
    //    public void test_anagram_group_with_number_of_items() {
    //        assertThat(dictionaryAnalyzerExecutor.executeOperation(new AnagramGroupsWithItems(4)).get(4), is(""));
    //    }
}