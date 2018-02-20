import impl.GuessGameImpl;
import interfaces.IGuessGame;

public class GameSarter {

    public static void main(String[] args) {

        IGuessGame guessGame = new GuessGameImpl();
        guessGame.runGame();
    }
}

