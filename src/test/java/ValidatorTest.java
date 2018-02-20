import impl.ValidatorImpl;
import interfaces.IValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {
    @Test
    public void canValidatorDetectNull() {
        //given
        IValidator validator = new ValidatorImpl();

        //when
        boolean isNull = validator.isNull(null);

        //then
        assertTrue(isNull);
    }
    @Test
    public void canValidatorConfirmNotNull() {
        //given
        IValidator validator = new ValidatorImpl();

        //when
        boolean isNull = validator.isNull("Byleco");

        //then
        assertFalse(isNull);
    }

    @Test
    public void canValidatorConfirmNotNumber() {
        //given
        IValidator validator = new ValidatorImpl();

        //when
        boolean isLiteral = validator.isLiteral("to nie jest numer");

        //then
        assertTrue(isLiteral);
    }
}
