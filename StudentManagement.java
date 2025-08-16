package mod2;
import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    void setDetails(Scanner sc) {
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Roll No:");
        rollNo = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Course:");
        course = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    float collegeFee;

    void setCollegeFee(Scanner sc) {
        System.out.println("Enter College Fee:");
        collegeFee = sc.nextFloat();
        sc.nextLine();
    }

    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    float hostelFee, messFee;

    void setHostelDetails(Scanner sc) {
        System.out.println("Enter Hostel Fee:");
        hostelFee = sc.nextFloat();
        System.out.println("Enter Mess Fee:");
        messFee = sc.nextFloat();
        sc.nextLine();
    }

    void displayAll() {
        System.out.println("--- HOSTELLER DETAILS ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    float busFee;

    void setBusFee(Scanner sc) {
        System.out.println("Enter Bus Fee:");
        busFee = sc.nextFloat();
        sc.nextLine();
    }

    void displayAll() {
        System.out.println("--- DAY SCHOLAR DETAILS ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hosteller h = new Hosteller();
        System.out.println("Enter Hosteller's Details:");
        h.setDetails(sc);
        h.setCollegeFee(sc);
        h.setHostelDetails(sc);

        DayScholar d = new DayScholar();
        System.out.println("Enter Day Scholar's Details:");
        d.setDetails(sc);
        d.setCollegeFee(sc);
        d.setBusFee(sc);

        h.displayAll();
        d.displayAll();
    }
}
// Milton Michael
// 16/8/25