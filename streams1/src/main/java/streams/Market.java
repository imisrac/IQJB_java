package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Market {

    private List<Transaction> transactions;
    private List<Trader> traders = new ArrayList<>();

    Market(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    void addTrader(Trader trader) {
        traders.add(trader);
    }

    List<Transaction> getTransactionsInYearSortedByValue(int year) {
        return transactions.stream().filter(transaction -> transaction.getYear() == year).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    List<String> getUniqeCities() {
        return traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
    }

    List<String> getTraderNamesFromCitySortedByName(String city) {
        return traders.stream().filter(trader -> trader.getCity().equals(city)).map(Trader::getName).sorted(String::compareTo).collect(Collectors.toList());
    }

    String getTradersStringSortedByName() {
        return traders.stream().sorted(Comparator.comparing(Trader::getName)).map(Trader::toString).collect(Collectors.joining("\n"));
    }

    boolean isAnyTraderBasedInCity(String city) {
        return !getTraderNamesFromCitySortedByName(city).isEmpty();
    }

    List<Integer> getTransactionValuesForCity(String city) {
        return transactions.stream()
                .filter(transaction -> getTraderNamesFromCitySortedByName(city).contains(transaction.getTrader().getName()))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
    }

    int getHighestTransactionValue() {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElseThrow(RuntimeException::new);
    }

    Transaction getTransactionWithLowestValue() {
        return transactions.stream()
                .reduce(BinaryOperator.minBy(Comparator.comparingInt(Transaction::getValue)))
                .orElseThrow(RuntimeException::new);
    }
}
