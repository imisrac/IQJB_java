import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LowerCaseValidatorTest {

    private LowerCaseValidator lowerCaseValidator = new LowerCaseValidator();

    @Test
    public void validate_uppercase_string() {
        assertFalse(lowerCaseValidator.validate("UPPERCASE"));
    }

    @Test
    public void validate_lowercase_string() {
        assertTrue(lowerCaseValidator.validate("lowercase"));
    }
}