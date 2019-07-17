public class UpperCaseValidator implements IValidation {
    public boolean validate(String input) {
        return input.toUpperCase().equals(input);
    }
}
