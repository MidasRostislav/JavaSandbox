package DataStructures.qPack;

public class CircularQueue {
    private char[] q;
    private int putloc, getloc;

    public int length;

    //Constructors
    public CircularQueue(int size){
        length = size + 1;
        q = new char[length];
        putloc = getloc = 0;
    }

    // Methods
    public void put(char ch){
        if(  putloc+1==getloc | ( (putloc==q.length-1) & (getloc==0) ) ){
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = ch;
        if(putloc == length)
            putloc = 0;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        if(getloc == length)
            getloc = 0;
        return q[getloc++];
    }

    public void reset(){
        length = q.length;
        q = new char[length];
        putloc = getloc = 0;
    }

}
