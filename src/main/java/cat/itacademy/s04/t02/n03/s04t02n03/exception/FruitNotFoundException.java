package cat.itacademy.s04.t02.n03.s04t02n03.exception;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(String message) {
        super(message);
    }
}
