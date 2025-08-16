package mod1;
import java.util.Scanner;


public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println(ch + " is not a letter!");
                }
                //Milton Michael
                // 16/8/25
        }
    }
}