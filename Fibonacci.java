import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (a <= n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
    // Milton Michael
    // 19/7/25
}