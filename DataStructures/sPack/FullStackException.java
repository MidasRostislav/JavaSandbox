package DataStructures.sPack;

import DataStructures.qPack.FullQueueException;

public class FullStackException extends Exception{

    int size;

    FullStackException(int size){
        this.size = size;
    }

    @Override
    public String toString(){
        return "\nStack is full, capacity is " + size;
    }


}
