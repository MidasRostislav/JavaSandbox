package DataStructures.qPack;

public class FixedQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;

    public int length;

    //Constructors
    public FixedQueue(int size){
        length = size + 1;
        q = new char[length];
        putloc = getloc = 0;
    }

    public FixedQueue(FixedQueue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        length = ob.q.length;
        q = new char[length];
        // There was for(int i = getloc; i < putloc; i++){
        //            q[i] = ob.q[i];
        //           }
        if (putloc - getloc >= 0)
            System.arraycopy(ob.q, getloc, q, getloc, putloc - getloc);
    }

    public FixedQueue(char[] a) throws FullQueueException{
        putloc = getloc = 0;
        length = a.length + 1;
        q = new char[length];
        //System.out.println("Creation queue from char array");
        for (char c : a) {
            put(c);
        }
    }

    // Methods
    public void put(char ch) throws FullQueueException{
        if(putloc == q.length - 1){
            throw new FullQueueException(q.length - 1);
        }
        q[putloc++] = ch;
    }

    public char get() throws EmptyQueueException {
        if(getloc == putloc){
            throw new EmptyQueueException();
        }
        return q[getloc++];
    }

    public void reset(){
        length = q.length;
        q = new char[length];
        putloc = getloc = 0;
    }

}
