import org.apache.commons.lang3.StringUtils;

public class ValidatorImpl implements IValidator {
    @Override
    public boolean isNull(String value) {
        return value == null;
    }

    @Override
    public boolean isLiteral(String value) {
        return !StringUtils.isNumeric(value);
    }
}