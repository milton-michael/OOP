package mod1;
import java.util.Vector;

public class FruitsVector {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    // Milton Michael
    // 16/8/25
}