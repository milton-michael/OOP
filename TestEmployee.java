package module1;

class Employee {
    protected int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(int salary) {
        super(salary);
    }

    void displayManagerSalary() {
        System.out.println("Manager salary (direct): " + salary);
        showSalary();
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Manager m1 = new Manager(50000);
        m1.displayManagerSalary();
    }
}
// Milton Michael
// 16/8/25