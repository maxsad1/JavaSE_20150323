package ru.javacourse.book.exception;

public class BookRuntimeException extends RuntimeException
{
    public BookRuntimeException() {
    }

    public BookRuntimeException(String message) {
        super(message);
    }

    public BookRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookRuntimeException(Throwable cause) {
        super(cause);
    }
}
