package Chapter11_Threads;

public class MySumThread extends MyThread{
    static final SumArray sa = new SumArray();
    int[] a;
    int answer;

    public MySumThread(String name, int[] nums){
        super(name);
        a = nums;
    }

    public static MySumThread createAndStart(String name, int[] nums){
        MySumThread mySumThrd = new MySumThread(name, nums);

        mySumThrd.thrd.start();
        return mySumThrd;
    }

    @Override
    public void run() {

        System.out.println(thrd.getName() + " - is running");
        synchronized (sa){
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " ends");
    }
}
