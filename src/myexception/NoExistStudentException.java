package myexception;

public class NoExistStudentException extends Throwable {
    public NoExistStudentException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "NoExistStudentException: " + super.getMessage();
    }
}
