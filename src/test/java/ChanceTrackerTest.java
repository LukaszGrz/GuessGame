import impl.ChanceTrackerImpl;
import interfaces.IChanceTracker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTrackerTest {
    @Test
    public void getChancesLeft() {
        //given
        IChanceTracker chanceTracker = new ChanceTrackerImpl(10);
        //when
        int chances = chanceTracker.getChancesLeft();
        //then
        assertEquals(10,chances);
    }

    @Test
    public void substractChanse() {
        //given
        IChanceTracker chanceTracker = new ChanceTrackerImpl(10);
        //when
        chanceTracker.substractChanse();
        int chancesLeft = chanceTracker.getChancesLeft();
        //then
        assertEquals(9,chancesLeft);
    }
}