package Chapter11_Threads;

public class TickTock {

    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }

        System.out.println("Tick");
        state = "ticked";
        notify();
        try{
            while (!state.equals("tocked"))
                wait();
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        state = "tocked";
        notify();
        try{
            while (!state.equals("ticked"))
                wait();
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
    }

}
