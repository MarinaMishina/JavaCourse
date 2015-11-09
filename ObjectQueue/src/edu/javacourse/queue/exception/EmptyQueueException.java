package edu.javacourse.queue.exception;

public class EmptyQueueException extends Exception {

    public EmptyQueueException() {
        super("Пустая очередь");
    }
 
}
