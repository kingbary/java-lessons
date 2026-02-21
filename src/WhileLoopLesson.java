import java.util.Scanner;

public class WhileLoopLesson {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // String username = "";

        // while (username.isEmpty()) {
        // System.out.print("Enter your username: ");
        // username = scanner.nextLine();
        // }

        // System.out.println(username);

        // String response = "";
        // while (!response.equals("Q")) {
        // System.out.println("You're playing a game");
        // System.out.print("Press 'Q' to quit: ");
        // response = scanner.next().toUpperCase();
        // }

        // int age = 0;

        // do {
        // System.out.println("You can't enter a negative age!");
        // System.out.print("Enter your age: ");
        // age = scanner.nextInt();
        // } while (age < 0);

        // System.out.println("You're " + age + " years old! ");

        int number = 0;

        do {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
