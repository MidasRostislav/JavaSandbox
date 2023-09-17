package Chapter11_Threads;

public class Priority implements Runnable{

    public Thread thrd;
    public int count;
    static boolean stop = false;
    static String currentName;

    public Priority(String name){
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }


    @Override
    public void run(){
        System.out.println(thrd.getName() +  " is started");
        do{
            count++;
            if(!thrd.getName().equals(currentName)){
                currentName = thrd.getName();
                //System.out.println("Into " + thrd.getName());
            }
        }while (!stop && count < 10000);
        stop = true;
        //System.out.println(thrd.getName() + " is interrupted");
    }
}
