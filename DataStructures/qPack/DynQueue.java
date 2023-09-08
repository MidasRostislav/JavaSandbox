package DataStructures.qPack;

import DataStructures.qPack.ICharQ;

public class DynQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;

    public int length;

    //Constructors
    public DynQueue(int size){
        length = size;
        q = new char[size];
        putloc = getloc = 0;
    }

    // Methods
    public void put(char ch){
        if(putloc == q.length){
            char[] t = new char[q.length * 2];
            System.arraycopy(q, 0, t, 0, q.length);
            q = t;
        }
        q[putloc++] = ch;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

    public void reset(){
        length = q.length;
        q = new char[length];
        putloc = getloc = 0;
    }

}
