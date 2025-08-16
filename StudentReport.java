package module1;
import java.util.*;

class Student {
    String name, regNo, course;
    int[] marks = new int[6];
    int total, rank;

    Student(String name, String regNo, String course, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
        this.marks = marks;
        calcTotal();
    }

    void calcTotal() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Reg No: ");
            String regNo = sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();

            int[] marks = new int[6];
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter mark for subject " + (j+1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i] = new Student(name, regNo, course, marks);
        }

        // Sorting in descending order of total
        Arrays.sort(students, (a, b) -> b.total - a.total);

        // Assign rank with tie handling
        int rank = 1;
        students[0].rank = 1;
        for (int i = 1; i < n; i++) {
            if (students[i].total == students[i-1].total) {
                students[i].rank = students[i-1].rank;
            } else {
                students[i].rank = i + 1;
            }
        }

        System.out.println("\nRegNo\tName\tCourse\tTotal\tRank");
        System.out.println("--------------------------------------");
        for (Student s : students) {
            System.out.println(s.regNo + "\t" + s.name + "\t" + s.course + "\t" + s.total + "\t" + s.rank);
        }
    }
    // Milton Michael
    // 16/08/2025
}