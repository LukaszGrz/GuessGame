import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserInputTest {
    @Test
    public void getUserInput() {
        //given
        IUserInput userInput = new UserInputImpl();
        //when
        userInput.setUserInput("666");
        String userShoot = userInput.getUserInput();
        //then
        assertEquals("666", userShoot);
    }

    @Test
    public void setUserInput() {
        //given
        IUserInput userInput = new UserInputImpl();
        //when
        userInput.setUserInput("666");
        String userShoot = userInput.getUserInput();
        //then
        assertEquals("666", userShoot);

    }
}