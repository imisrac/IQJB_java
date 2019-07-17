import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UpperCaseValidatorTest {

    private UpperCaseValidator upperCaseValidator = new UpperCaseValidator();

    @Test
    public void validate_uppercase_string() {
        assertTrue(upperCaseValidator.validate("UPPERCASE"));
    }

    @Test
    public void validate_lowercase_string() {
        assertFalse(upperCaseValidator.validate("lowercase"));
    }
}