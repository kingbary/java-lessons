import java.util.Random;
import java.util.Scanner;

public class DiceRollProgram {
    static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();

        if (numberOfDice > 0) {
            for (int i = 0; i < numberOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                total += roll;
            }
        } else {
            System.out.println("Number of dice cannot be negative!");
        }

        System.out.println("Total: " + total);

        scanner.close();

    }

    static void printDie(int roll) {
        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                """;

        String dice2 = """
                  -------
                 |  ●    |
                 |       |
                 |     ● |
                  -------
                """;
        String dice3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------
                """;
        String dice4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------
                """;

        String dice5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------
                """;
        String dice6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }

}

// DECLARE VARIABLES
// GET # OF DICE FROM USER
// CHECK IF # IS LESS THAN ZERO
// ROLL ALL THE DICE
// GET THE TOTAL
// DISPLAY THE ASCII OF DICE
