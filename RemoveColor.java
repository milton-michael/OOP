package mod1;
import java.util.Vector;

public class RemoveColor {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");

        System.out.println(colors);
    }
    // Milton Michael
    // 16/8/25
}