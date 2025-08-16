package mod1;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  
            sum += digit;
            num /= 10;  
        }

        System.out.println("Sum of digits = " + sum);
        // Milton Michael
        // 16/08/25
    }
}