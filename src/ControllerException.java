public class ControllerException extends Exception {

    public ControllerException() {
        System.out.println("you have an exception.");
    }

    public ControllerException(String message) {
        super(message);
    }

    public ControllerException(String message, Throwable cause) {
        super(message, cause);
    }

}
