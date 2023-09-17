package Chapter11_Threads;

public class MyThreadExt extends Thread{

    public MyThreadExt(String name){
        super(name);
    }

    public static MyThreadExt createAndStart(String name){
        MyThreadExt mt = new MyThreadExt(name);
        mt.start();
        return mt;
    }

    @Override
    public void run(){
        System.out.println(getName() + " - is running");
        try {
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("In " + getName() + " counter: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " is interrupted");
        }
        System.out.println(getName() + " ends");
    }



}
