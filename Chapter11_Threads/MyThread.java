package Chapter11_Threads;

public class MyThread implements Runnable {
    public Thread thrd;

    public MyThread(String name){
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart(String name){
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - is running");
        try {
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " counter: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " is interrupted");
        }
        System.out.println(thrd.getName() + " ends");
    }
}
