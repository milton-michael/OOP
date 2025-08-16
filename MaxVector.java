package mod1;
import java.util.Vector;

public class MaxVector {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(25);
        nums.add(60);
        nums.add(15);
        nums.add(80);
        nums.add(45);

        int max = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Maximum = " + max);
    }
    // Milton Michael
    // 16/8/25
}