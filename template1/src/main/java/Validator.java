abstract class Validator {
    private boolean valid = false;

    private void printGreeting() {
        System.out.println("Validation is in progress...");
    }

    public final boolean validate(String input) {
        return input.chars().mapToObj(value -> check((char) value)).allMatch(Boolean.TRUE::equals);
    }

    abstract boolean check(char c);

    private void printResult() {
        System.out.println(valid);
    }
}
