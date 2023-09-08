package DataStructures.qPack;

public class EmptyQueueException extends Exception {
    EmptyQueueException(){}

    @Override
    public String toString(){
        return "\nQueue is empty";
    }
}
