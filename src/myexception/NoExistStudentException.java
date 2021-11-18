package myexception;

public class NoExistStudentException extends RuntimeException {
    public NoExistStudentException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "NoExistStudentException: " + super.getMessage();
    }
}
