import java.util.Scanner;

public class ScannerLesson {
    // public static void main(String[] arg) {
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter your name:");
    // String name = scanner.nextLine();

    // System.out.print("What's your age: ");
    // int age = scanner.nextInt();

    // System.out.print("What's your GPA: ");
    // double gpa = scanner.nextDouble();

    // System.out.print("Are you a student? (true/false): ");
    // boolean isStudent = scanner.nextBoolean();

    // System.out.println("Hello, " + name);
    // System.out.println("You're " + age + " " + "years old");
    // System.out.println("Your GPA is " + gpa);
    // System.out.println("Student: " + isStudent);
    // if (isStudent) {
    // System.out.println("You are a student");
    // } else {
    // System.out.println("You are NOT a student");
    // }

    // scanner.close();
    // }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        System.out.print("Enter the width: ");
        System.out.print("Hello World!");
        width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("The area is: " + area);

        scanner.close();
    }
}
