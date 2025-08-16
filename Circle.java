package mod1;
import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void compute() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.compute();
    }
    // Milton Michael
    // 16/8/25
}