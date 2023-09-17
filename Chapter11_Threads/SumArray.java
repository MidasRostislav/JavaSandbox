package Chapter11_Threads;

public class SumArray {

    private int sum;
    int sumArray(int[] nums) {
        sum = 0;
        for (int num : nums) {
            sum += num;
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

