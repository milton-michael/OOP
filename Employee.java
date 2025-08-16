package mod1;
import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Employee 1 (id, name, salary): ");
        int id1 = sc.nextInt();
        String name1 = sc.next();
        double sal1 = sc.nextDouble();

        System.out.println("Enter details of Employee 2 (id, name, salary): ");
        int id2 = sc.nextInt();
        String name2 = sc.next();
        double sal2 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);
        Employee e2 = new Employee(id2, name2, sal2);

        System.out.println("\nEmployee Details:");
        e1.displayEmployee();
        e2.displayEmployee();
    }
    // Milton Michael
    // 16/8/25
}