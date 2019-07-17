public class DigitValidator implements IValidation {
    public boolean validate(String input) {
        Integer integer;
        try {
            integer = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return integer >= 0 && integer < 10;
    }
}
