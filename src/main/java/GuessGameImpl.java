import java.util.Random;
import java.util.Scanner;

public class GuessGameImpl implements IGuessGame {

    private IUserInput _userInput;
    private IChanceTracker _chanceTracker;
    private IShowInfo _showInfo;
    private IValidator _validator;

    public GuessGameImpl() {
        this._userInput = new UserInputImpl();
        this._chanceTracker = new ChanceTrackerImpl(10);
        this._showInfo = new ShowInfoImpl();
        this._validator = new ValidatorImpl();
    }

    @Override
    public void runGame() {
        Random random = new Random();
        int winnerNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        boolean userWins = false;

        _showInfo.showMessage(Messages.welcomeMessage);
        while (_chanceTracker.getChancesLeft() > 0 )
        {
            _showInfo.showMessage(Messages.makeChoiceMessage);
            _userInput.setUserInput(scanner.nextLine());
            if (_validator.isNull(_userInput.getUserInput()) || _validator.isLiteral(_userInput.getUserInput()))
            {
                _chanceTracker.substractChanse();
                _showInfo.showMessage(Messages.validationErrorMessage);
            } else
            {
                int guess = new Integer(_userInput.getUserInput());
                if (guess == winnerNumber){
                    _showInfo.showMessage(Messages.winMessage);
                    userWins = true;
                    break;
                }
                else if (guess < winnerNumber){
                    _chanceTracker.substractChanse();
                    _showInfo.showMessage(Messages.toLowMessage);
                }
                else if (guess > winnerNumber){
                    _chanceTracker.substractChanse();
                    _showInfo.showMessage(Messages.toHighMessage);
                }
            }
        }
        if(!userWins)
        {
            _showInfo.showMessage(Messages.loseMessage);
        }
    }
}