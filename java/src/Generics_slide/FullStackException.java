package Generics_slide;

public class FullStackException extends RuntimeException{
    public FullStackException()
    {
        this("Stack is full ");
    }
    public FullStackException(String exception)
    {
        super(exception);
    }
}
