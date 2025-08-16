package mod1;
import java.util.Scanner;
import java.util.Vector;

public class SearchItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> items = new Vector<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        System.out.print("Enter item to search: ");
        String search = sc.nextLine();

        if (items.contains(search)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
    // Milton Michael
    // 16/8/25
}