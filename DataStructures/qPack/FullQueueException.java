package DataStructures.qPack;

public class FullQueueException extends Exception{
    int size;

    FullQueueException(int size){
        this.size = size;
    }

    @Override
    public String toString(){
        return "\nQueue is full, max capacity is " + size;
    }
}
