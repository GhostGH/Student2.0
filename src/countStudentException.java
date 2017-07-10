public class countStudentException extends Exception {
    @Override
    public String getMessage() {
        return "Array is full!";
    }
}
