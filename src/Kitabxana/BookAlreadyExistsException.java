package Kitabxana;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String message){
        super(message);
    }
}
