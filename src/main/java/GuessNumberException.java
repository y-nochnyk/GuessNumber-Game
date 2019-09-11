import java.io.IOException;

//A new exception called GuessNumberException created especially for this app
public class GuessNumberException extends IOException {
    public GuessNumberException(String message) {
        super(message);
    }

    public String getMessage() {
        return "GuessNumberException: " + super.getMessage();
    }
}
