package impl;

import interfaces.IUserInput;

public class UserInputImpl implements IUserInput {
    String userInput;
    @Override
    public String getUserInput() {
        return userInput;
    }

    @Override
    public void setUserInput(String guess) {
        this.userInput = guess;
    }
}
