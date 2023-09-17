package Chapter11_Threads;

public class SumArray {

    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Actual sum for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
        return sum;
    }
}

