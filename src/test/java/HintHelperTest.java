import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HintHelperTest {
    @Test
    public void canHelperConfirmLowerNumberPick() {
        //arange
        IHintHelper helper = new HintHelperImpl();

        //act
        boolean isLover = helper.isLower(100,50);

        //assert
        assertTrue(isLover);
    }

    @Test
    public void isHigher() {
        //arange
        IHintHelper helper = new HintHelperImpl();

        //act
        boolean isHigher = helper.isHigher(50,500);

        //assert
        assertTrue(isHigher);
    }
}