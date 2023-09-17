package Chapter11_Threads;

public class MyTickTockThread extends MyThread{

    TickTock ttOb;

    public MyTickTockThread(String name, TickTock tt){
        super(name);
        ttOb = tt;
    }

    public static MyTickTockThread createAndStart(String name, TickTock tt){
        MyTickTockThread myTickTockThrd = new MyTickTockThread(name, tt);

        myTickTockThrd.thrd.start();
        return myTickTockThrd;
    }

    @Override
    public void run(){
        if(thrd.getName().equals("Tick")){
            for (int i =0; i < 3; i++)
                ttOb.tick(true);
        ttOb.tick(false);
        return;
        }
        if(thrd.getName().equals("Tock")){
            for (int i =0; i < 3; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
//        else
//            System.out.println("Incorrect thread name. Available thread names: Tick/Tock");
    }



}
