public class CanNotFireException extends Exception{

    public CanNotFireException(String message) {
        super(message);
    }

    public CanNotFireException() {
        System.out.println("Can not fire this.");
    }
    
}
