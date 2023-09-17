import java.io.*;
import java.util.Scanner;
import Chapter11_Threads.*;



public class Main {

    public static void main(String[] args)
    throws IOException{
        useTickTockThreads();
    }

    public static void useTickTockThreads(){
        TickTock tt = new TickTock();

        MyTickTockThread mttt1 = MyTickTockThread.createAndStart("Tick", tt);
        MyTickTockThread mttt2 = MyTickTockThread.createAndStart("Tock", tt);

        try{
            mttt1.thrd.join();
            mttt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
    }

    public static void useMySumThreads(){
        int[] a = {1,2,3,4,5};

        MySumThread mst1 = MySumThread.createAndStart("Child thread #1", a);
        MySumThread mst2 = MySumThread.createAndStart("Child thread #2", a);

        try {
            mst1.thrd.join();
            mst2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread interruption");
        }

    }

    public static void usePriorityThreads(){
        System.out.println("Main thread starts\n");

        MyPriorityThread mt1 = new MyPriorityThread("High priority");
        mt1.thrd.setPriority(Thread.MAX_PRIORITY);
        //System.out.println("High threads priority is " + mt1.thrd.getPriority());
        MyPriorityThread mt2 = new MyPriorityThread("Low priority");
        mt2.thrd.setPriority(Thread.MIN_PRIORITY);
        //System.out.println("Low threads priority is " + mt2.thrd.getPriority());
        MyPriorityThread mt3 = new MyPriorityThread("Default priority");
        MyPriorityThread mt4 = new MyPriorityThread("Default priority");

        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();

        //MyThread mt = new MyThread("Another thread #?");

        try{
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            }
        catch (InterruptedException exc){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("\nMain thread ends\n");
        System.out.println("High priority counter = " + mt1.count);
        System.out.println("Low priority counter = " + mt2.count);
        System.out.println("Default priority counter = " + mt3.count);
        System.out.println("Default priority counter = " + mt4.count);

    }

    public static void useExtendThread(){
        System.out.println("Main thread starts");

        MyThreadExt mt = MyThreadExt.createAndStart("Child thread #1");
//        MyThreadExt mt = new MyThreadExt("Another thread #?");
//        mt.start();
        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread is interrupted");
            }
        }while(mt.isAlive());
        System.out.println("Main thread ends");

    }

    public static void useThreads(){
        System.out.println("Main thread starts");

        MyThread mt1 = MyThread.createAndStart("Child thread #1");
        MyThread mt2 = MyThread.createAndStart("Child thread #2");
        MyThread mt3 = MyThread.createAndStart("Child thread #3");

        //MyThread mt = new MyThread("Another thread #?");

        try{
            mt1.thrd.join();
            System.out.println("Child thread #1 joined.");
            mt2.thrd.join();
            System.out.println("Child thread #2 joined.");
            mt3.thrd.join();
            System.out.println("Child thread #3 joined.");
        }
        catch (InterruptedException exc){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread ends");
    }

    public static void secondWhahahaha()
    throws IOException{

        try (Scanner sc = new Scanner(new FileInputStream("Calculator/input.txt"))) {

            double a = Double.parseDouble(sc.next());
            String operation = sc.next();
            double b = Double.parseDouble(sc.next());

            switch (operation) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> {
                    if (b == 0)
                        throw new ArithmeticException();
                    System.out.println(a / b);
                }
                default -> throw new UnsupportedOperationException();
            }
        } catch (NumberFormatException exc) {
            System.out.println("Error! Not number");
        } catch (UnsupportedOperationException exc) {
            System.out.println("Operation Error!");
        } catch (ArithmeticException exc) {
            System.out.println("Error! Division by zero");
        }
    }



    public static void whahahahaha(){
        Scanner sc = new Scanner(System.in);
        double a, b;
        String[] str = sc.nextLine().split(" ");
        sc.close();
        try {
            a = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[2]);
        }
        catch (NumberFormatException exc){
            System.out.println("Error! Not number");
            return;
        }
        switch (str[1]) {
            case "+" : System.out.println(a + b); break;
            case "-" : System.out.println(a - b); break;
            case "*" : System.out.println(a * b); break;
            case "/" : System.out.println(b == 0 ? "Error! Division by zero" : a / b); break;
            default : System.out.println("Operation Error!");
        }
    }


    static void customExceptDemo(){
        int[] numer = {4,8,15,32,64,127,256,512};
        int[] denom = {2,0,4,4,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NonIntResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " + denom[i] + " equals " + numer[i] / denom[i]);


            } catch (ArithmeticException exc) {
                System.out.println("Divide by zero attempt");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Necessary element not found");
            }
            catch(NonIntResultException exc){
                System.out.println(exc);
            }
        }
    }


    static void exPlusFinally(){
        for(int i = 0; i < 3; i++){
            exceptionTryCatchCheck(i);
            System.out.println();
        }
    }

    static void exceptionTryCatchCheck(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Got: " + what);

        try {
            switch (what) {
                case 0 -> t = 10 / what;
                case 1 -> nums[4] = 0;
            }
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException exc){
            System.out.println("Exception " + exc + "\nSuccessfully  caught");
        }
        finally {
            System.out.println("Exit from try block");
        }
    }





}










