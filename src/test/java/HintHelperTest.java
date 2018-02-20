import impl.HintHelperImpl;
import interfaces.IHintHelper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HintHelperTest {
    @Test
    public void canHelperConfirmLowerNumberPick() {
        //given
        IHintHelper helper = new HintHelperImpl();

        //when
        boolean isLover = helper.isLower(100,50);

        //then
        assertTrue(isLover);
    }

    @Test
    public void isHigher() {
        //given
        IHintHelper helper = new HintHelperImpl();

        //when
        boolean isHigher = helper.isHigher(50,500);

        //then
        assertTrue(isHigher);
    }
}