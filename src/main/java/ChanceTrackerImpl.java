public class ChanceTrackerImpl implements IChanceTracker {
    private int chanceLimit;

    public ChanceTrackerImpl(int chanceLimit) {
        this.chanceLimit = chanceLimit;
    }

    @Override
    public int getChancesLeft() {
        return chanceLimit;
    }

    @Override
    public void substractChanse() {
        chanceLimit--;
    }
}
