public class LowerCaseValidator implements IValidation {
    public boolean validate(String input) {
        return input.toLowerCase().equals(input);
    }
}
