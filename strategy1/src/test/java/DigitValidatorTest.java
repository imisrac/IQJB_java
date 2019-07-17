import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DigitValidatorTest {

    private DigitValidator digitValidator = new DigitValidator();

    @Test
    public void validate_empty_string() {
        assertFalse(digitValidator.validate(""));
    }

    @Test
    public void validate_number() {
        assertTrue(digitValidator.validate("8"));
    }

    @Test
    public void test_string() {
        assertFalse(digitValidator.validate("abc"));
    }

    @Test
    public void test_big_number() {
        assertFalse(digitValidator.validate("123"));
    }
}