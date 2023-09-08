package DataStructures.qPack;

public interface ICharQ {
    void put (char ch)
            throws FullQueueException;
    char get() throws EmptyQueueException;
    void reset();

}
