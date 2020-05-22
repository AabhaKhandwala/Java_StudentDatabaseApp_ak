import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("\n1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();

        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
        // studentID);

    }

    // Generate an ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop,uset hits Q
        do {
            System.out.print("Enter courses to enroll (Q to Quit): ");
            Scanner in = new Scanner(System.in);
            String coures = in.nextLine();
            if (!coures.equals("Q")) {
                courses = courses + "\n " + coures;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                // System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);
        // System.out.println("ENROLLED In: ");

    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tutionBalance);
    }

    // Pay Tution
    public void payTution() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade level: " + gradeYear + "\nCourses Enrolled:" + courses
                + "\nBalance: $" + tutionBalance;
    }

}