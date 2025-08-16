package mod2;
import java.util.Scanner;

class Employee {
    String name, address;
    int age, mob;
    float sal;

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String spl;

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class Manager extends Employee {
    String dep;

    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer of = new Officer();
        System.out.println("Enter Officer's Name:");
        of.name = sc.nextLine();
        System.out.println("Enter Address:");
        of.address = sc.nextLine();
        System.out.println("Enter Age:");
        of.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        of.mob = sc.nextInt();
        System.out.println("Enter Salary:");
        of.sal = sc.nextFloat();
        sc.nextLine(); 
        System.out.println("Enter Specialization:");
        of.spl = sc.nextLine();

        Manager mg = new Manager();
        System.out.println("Enter Manager's Name:");
        mg.name = sc.nextLine();
        System.out.println("Enter Address:");
        mg.address = sc.nextLine();
        System.out.println("Enter Age:");
        mg.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        mg.mob = sc.nextInt();
        System.out.println("Enter Salary:");
        mg.sal = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Department:");
        mg.dep = sc.nextLine();

        System.out.println("--- Officer Details ---");
        System.out.println("Name: " + of.name);
        System.out.println("Address: " + of.address);
        System.out.println("Age: " + of.age);
        System.out.println("Mobile: " + of.mob);
        of.print_Salary();
        of.print_Specialization();

        System.out.println("--- Manager Details ---");
        System.out.println("Name: " + mg.name);
        System.out.println("Address: " + mg.address);
        System.out.println("Age: " + mg.age);
        System.out.println("Mobile: " + mg.mob);
        mg.print_Salary();
        mg.print_Dept();
    }
}
// Milton Michael
// 16/8/25