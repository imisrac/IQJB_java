package streams;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;


public class MarketTest {

    private Market market;
    private Trader raoul = new Trader("Raoul", "Cambridge");
    private Trader mario = new Trader("Mario", "Milan");
    private Trader alan = new Trader("Alan", "Cambridge");
    private Trader brian = new Trader("Brian", "Cambridge");

    @Before
    public void setUp() throws Exception {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        market = new Market(transactions);
    }

    @Test
    public void test_sorted_in_2011() {
        assertThat(market.getTransactionsInYearSortedByValue(2011),
                is(Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2011, 400))));
    }

    @Test
    public void test_uniqe_cities() {
        assertThat(market.getUniqeCities(), Matchers.containsInAnyOrder(Arrays.asList("Cambridge", "Milan").toArray()));
    }

    @Test
    public void test_sorted_from_Cambridge() {
        assertThat(market.getTraderNamesFromCitySortedByName("Cambridge"), is(Arrays.asList("Alan", "Brian", "Raoul")));
    }

    @Test
    public void test_sorted_traders_one_string() {
        assertThat(market.getTradersStringSortedByName(),
                is("Trader: Alan in Cambridge\nTrader: Brian in Cambridge\nTrader: Mario in Milan\nTrader: Raoul in Cambridge"));
    }

    @Test
    public void test_anybody_from_milan() {
        assertThat(market.isAnyTraderBasedInCity("Milan"), is(Boolean.TRUE));
    }

    @Test
    public void test_transactions_values_for_Cambridge_traders() {
        assertThat(market.getTransactionValuesForCity("Cambridge"), Matchers.containsInAnyOrder(300, 1000, 400, 950));
    }

    @Test
    public void test_highest_transaction_value() {
        assertThat(market.getHighestTransactionValue(), is(1000));
    }

    @Test
    public void test_transaction_with_lowest_value() {
        assertThat(market.getTransactionWithLowestValue(), is(new Transaction(brian, 2011, 300)));
    }
}