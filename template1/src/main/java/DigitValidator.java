class DigitValidator extends Validator {


    @Override
    boolean check(char c) {
        return Character.getNumericValue(c) < 10;
    }
}
