public class MyException extends Exception {

    private final ErrorCode code;

    public MyException(ErrorCode code) {
        super();
        this.code = code;
    }
}