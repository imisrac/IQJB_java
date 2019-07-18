package streams;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
        market.addTrader(raoul);
        market.addTrader(mario);
        market.addTrader(alan);
        market.addTrader(brian);
    }

    @Test
    public void test_sorted_in_2011() {
        assertThat(market.getTransactionsInYearSortedByValue(2011), is(Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2011, 400))));
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
        assertThat(market.getTradersStringSortedByName(), is("Trader: Alan in Cambridge\nTrader: Brian in Cambridge\nTrader: Mario in Milan\nTrader: Raoul in Cambridge"));
    }
}