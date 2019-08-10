package streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


class Market {

    private List<Transaction> transactions;

    Market(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    List<Transaction> getTransactionsInYearSortedByValue(int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<String> getUniqeCities() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> getTraderNamesFromCitySortedByName(String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.toList());
    }

    String getTradersStringSortedByName() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }

    boolean isAnyTraderBasedInCity(String city) {
        //        return !getTraderNamesFromCitySortedByName(city).isEmpty();
        return transactions.stream()
                .anyMatch(transaction -> city.equals(transaction.getTrader().getCity()));
    }

    List<Integer> getTransactionValuesForCity(String city) {
        return transactions.stream()
                //                .filter(transaction -> getTraderNamesFromCitySortedByName(city).contains(transaction.getTrader().getName()))
                .filter(transaction -> city.equals(transaction.getTrader().getCity()))
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
