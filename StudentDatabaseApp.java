import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how mny students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n mumber of new students
        for (int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();

        }
        for (int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}