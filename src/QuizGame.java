import java.util.Scanner;

public class QuizGame {
    static void main(String[] arg) {

        // Questions Array []
        // Options Array [][]
        // Declare variables
        // Welcome message
        // Question Loop
        // Options
        // Get guess from user
        // Check our guess
        // Display final score

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "Who is the president of Nigeria?",
                "What is the capital of Nigeria?",
                "Who is the richest man in africa?"
        };

        String[][] options = {
                { "1. Abraham Lincoln", "2. Bola Ahmed Tinubu", "3. Godswill Akpabio" },
                { "1. Lagos", "2. Katsina", "3. Abuja" },
                { "1. Femi Otedola", "2. Aliko Dangote", "3. Ibrahim Musa" }
        };
        int[] answers = { 2, 3, 2 };
        int score = 0;
        int guess;

        System.out.println("*************************");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                score++;
                System.out.println("*******");
                System.out.println("CORRECT!");
                System.out.println("*******");
            } else {
                System.out.println("*******");
                System.out.println("WRONG!");
                System.out.println("*******");

            }
        }

        System.out.println("You scored " + score + " out of " + questions.length);

        scanner.close();

    }

}
