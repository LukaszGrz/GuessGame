package impl;

import interfaces.IHintHelper;

public class HintHelperImpl implements IHintHelper {
    @Override
    public boolean isLower(int expected, int actual) {
        return actual < expected;
    }

    @Override
    public boolean isHigher(int expected, int actual) {
        return actual > expected;
    }
}
