package DataStructures.sPack;

import DataStructures.qPack.FullQueueException;

public class Stack {
    private char[] s;
    private int putloc;
    public int length;

    //Constructors
    public Stack(int size){
        length = size;
        s = new char[length];
        putloc = 0;
    }

    public Stack(Stack ob){
        putloc = ob.putloc;
        length = ob.s.length;
        s = new char[length];
        for(int i = 0; i < putloc; i++){
            s[i] = ob.s[i];
        }
    }

    public Stack(char[] a)
    throws FullStackException{
        putloc = 0;
        length = a.length;
        s = new char[length];
        //System.out.println("Creation queue from char array");
        for(int i = 0; i < a.length; i++){
            //System.out.println("a[i] from argument array = " + a[i]);
            push(a[i]);
            //System.out.println("q[i] from creating array = " + q[i]);
        }
    }

    // Methods
    public void push(char ch)
    throws FullStackException {
        if(putloc == s.length)
            throw new FullStackException(s.length);

        s[putloc++] = ch;
    }

    public char pop()
    throws EmptyStackException{
        if(putloc == 0)
            throw new EmptyStackException();

        putloc -= 1;
        return s[putloc];
    }
}
