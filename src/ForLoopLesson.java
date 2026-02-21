import java.util.Scanner;

public class ForLoopLesson {
    public static void main(String[] arg) throws InterruptedException {
        // for (int i = 1; i <= 10; i++) {
        // // if (i == 5) {
        // // break;
        // // }
        // if (i == 5) {
        // continue;
        // }
        // System.out.print(i + " ");
        // }

        // Scanner scanner = new Scanner(System.in);
        // int max;
        // System.out.print("How many seconds to countdown from?: ");
        // max = scanner.nextInt();
        // for (int i = max; i >= 1; i--) {
        // System.out.println(i);
        // Thread.sleep(1000);
        // }
        // System.out.println("You made it!!");
        // scanner.close();

        // NESTED LOOPS EXAMPLE
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j < 10; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of colums: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
