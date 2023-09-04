package Last3Homeworks.Homework11;

public class IncorrectFileException extends Exception {
    private int errorCode;

    public IncorrectFileException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
