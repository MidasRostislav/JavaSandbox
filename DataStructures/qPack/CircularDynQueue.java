package DataStructures.qPack;

public class CircularDynQueue {
    private char[] q;
    private int putloc, getloc;

    public int length;

    //Constructors
    public CircularDynQueue(int size){
        length = size + 1;
        q = new char[length];
        putloc = getloc = 0;
    }

    // Methods
    public void put(char ch){
        /*if(  putloc+1==getloc | ( (putloc==q.length-1) & (getloc==0) ) ){
            System.out.println("Queue is full");
            return;
        }
        */
        if( (putloc==q.length) & (getloc==0) ){
            char[] t = new char[q.length * 2];
            System.arraycopy(q, 0, t, 0, q.length);
            q = t;
        } else if (putloc+1 == getloc) {
            char[] t = new char[q.length * 2];
            System.arraycopy(q, getloc, t, 0, q.length - getloc);
            System.arraycopy(q, 0, t, q.length - getloc + 1, q.length - (q.length - getloc));
            q = t;
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

