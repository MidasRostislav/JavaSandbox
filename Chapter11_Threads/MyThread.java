package Chapter11_Threads;

public class MyThread implements Runnable {
    String thrdName;

    public MyThread(String thrdName){
        this.thrdName = thrdName;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " - is running");

        try {
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + " counter: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " is interrupted");
        }
        System.out.println(thrdName + " ends");
    }
}
