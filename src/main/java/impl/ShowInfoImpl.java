package impl;

import interfaces.IShowInfo;

public class ShowInfoImpl implements IShowInfo {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
