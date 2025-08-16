package mod1;
import java.util.Vector;

public class SumVector {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
    // Milton Michael
    // 16/8/25
}