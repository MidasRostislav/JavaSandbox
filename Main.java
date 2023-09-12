import java.io.*;
import java.util.Scanner;
import Chapter11_Threads.*;



public class Main {

    public static void main(String[] args)
    throws IOException{
        useThreads();


    }

    public static void useThreads(){
        System.out.println("Main thread start");
        MyThread mt = new MyThread("Child thread #1");
        Thread thread = new Thread(mt);
        thread.start();

        for(int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread is interrupted");
            }
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










