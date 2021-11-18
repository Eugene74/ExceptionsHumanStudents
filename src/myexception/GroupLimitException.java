package myexception;

public class GroupLimitException extends RuntimeException {
    public GroupLimitException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "GroupLimitException: " + super.getMessage();
    }
}
