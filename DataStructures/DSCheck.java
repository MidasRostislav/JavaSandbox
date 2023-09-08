package DataStructures;

import DataStructures.qPack.*;
import DataStructures.sPack.EmptyStackException;
import DataStructures.sPack.FullStackException;
import DataStructures.sPack.Stack;

public class DSCheck {


    public static void stackCheck() {

        Stack s1 = new Stack(10);

        try {
            for (int i = 0; i < s1.length + 2; i++) {
                s1.push((char) ('A' + i));
            }
        }
        catch (FullStackException exc){
            System.out.println(exc);
        }

        Stack s3 = new Stack(s1);

        // Printing Stacks content
        try {
            char[] name = {'T', 'o', 'm'};
            Stack s2 = new Stack(name);

            System.out.println("s1 contains");
            for (int i = 0; i < s1.length; i++) {
                System.out.print(s1.pop());
            }
            System.out.println();

            System.out.println("s2 contains");
            for (int i = 0; i < s2.length; i++) {
                System.out.print(s2.pop());
            }
            System.out.println();

            System.out.println("s3 contains");
            for (int i = 0; i < s3.length + 1; i++) {
                System.out.print(s3.pop());
            }
            System.out.println();
        }
        catch (EmptyStackException | FullStackException exc){
            System.out.println(exc);
        }

    }


    public static void circularQueueCheck(){
        CircularQueue circQueue = new CircularQueue(10);
        for(int i = 0; i < 11; i++) {
            circQueue.put((char) ('A' + i));
        }
        for(int i = 0; i < 3; i++){
            System.out.print(circQueue.get());
        }
        System.out.println();

        for(int i = 0; i < 3; i++) {
            circQueue.put('X');
        }
        for(int i = 0; i < 10; i++){
            System.out.print(circQueue.get());
        }
    }


    public static void fixedAndDynQueuesWithExcCheck(){
        FixedQueue fixedQueue = new FixedQueue(10);
        DynQueue dynQueue = new DynQueue(5);
        ICharQ iQ;

        int i;
        iQ = fixedQueue;

        try {
            for(i = 0; i < 12; i++){
                iQ.put((char)('A' + i));
            }
        }
        catch (FullQueueException exc){
            System.out.println(exc);
        }

        System.out.println("FixedQueue check: ");

        try {
            for(i = 0; i < 12; i++){
                System.out.print(iQ.get() + " ");
            }
            System.out.println();
        }
        catch(EmptyQueueException exc){
            System.out.println(exc);
        }

        iQ = dynQueue;

        try {
            for(i = 0; i < 15; i++){
                iQ.put((char)('K' + i));
            }
        }
        catch (FullQueueException exc){
            System.out.println(exc);
        }

        System.out.println("DynQueue check: ");

        try {
            for(i = 0; i < 15; i++){
                System.out.print(iQ.get() + " ");
            }
        }
        catch(EmptyQueueException exc){
            System.out.println(exc);
        }

    }


    public static void circularDynamicQueueCheck(){
        CircularDynQueue test = new CircularDynQueue(10);
        for(int i = 0; i < 11; i++) {
            test.put((char) ('A' + i));
            System.out.println("If not QueueFull, successfully put element: " + ((char) ('A' + i)));
        }
        for(int i = 0; i < 3; i++){
            System.out.print(test.get());
            System.out.println("If not QueueEmpty successfully get element: " + test.get());
        }
        System.out.println();

        for(int i = 0; i < 3; i++) {
            test.put('X');
        }
        for(int i = 0; i < 10; i++){
            System.out.print(test.get());
        }

    }


    /*  Queue Class become a FixedQueue Class
    static void queueCheckEx6_2(){
        // Queue constructors overload

        // Queues declaration and initialization
        Queue q1 = new Queue(10);

        char[] name = {'T', 'o', 'm'};

        Queue q2 = new Queue(name);

        for(int i = 0; i < q1.length - 1; i++){
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        Queue q4 = new Queue(q3);

        // Printing Queues content
        System.out.println("q1 contains");
        for (int i = 0; i < q1.length - 1; i++){
            System.out.print(q1.get());
        }
        System.out.println();

        System.out.println("q2 contains");
        for (int i = 0; i < q2.length - 1; i++){
            System.out.print(q2.get());
        }
        System.out.println();

        System.out.println("q3 contains");
        for (int i = 0; i < q3.length - 1; i++){
            System.out.print(q3.get());
        }
        System.out.println();

        System.out.println("q4 contains");
        for (int i = 0; i < q4.length - 1; i++){
            System.out.print(q4.get());
        }
        System.out.println();
    }
}
*/






}


