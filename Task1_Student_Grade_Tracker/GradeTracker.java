import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Student Grade Tracker ===");
            System.out.println("1. Add Student");
            System.out.println("2. Show Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        students.add(new Student(name, grade));
        System.out.println("Student added successfully!");
    }

    private static void showReport() {
        if (students.isEmpty()) {
            System.out.println("No students added yet!");
            return;
        }

        double total = 0, highest = -1, lowest = 101;
        String topStudent = "", lowStudent = "";

        for (Student s : students) {
            total += s.getGrade();
            if (s.getGrade() > highest) {
                highest = s.getGrade();
                topStudent = s.getName();
            }
            if (s.getGrade() < lowest) {
                lowest = s.getGrade();
                lowStudent = s.getName();
            }
        }

        double average = total / students.size();

        System.out.println("\n===== REPORT =====");
        System.out.println("Total Students: " + students.size());
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest + " ( " + topStudent + " )");
        System.out.println("Lowest Grade: " + lowest + " ( " + lowStudent + " )");
    }
}
