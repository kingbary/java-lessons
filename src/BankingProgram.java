import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] arg) {

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // DISPLAY MENU
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1 -4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

            // GET AND PROCESS USER CHOICE

            // showBalance()

            // deposit()

            // withdraw()

            // EXIT MESSAGE
        }
        System.out.println("**************************");
        System.out.println("Thank you for banking us!!");
        System.out.println("**************************");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Enter an amount to be deposit: ");
        amount = scanner.nextDouble();

        if (amount < 1) {
            System.out.println("Deposit amount cannot be less than 1");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance) {

        double withdrawableAmount;
        System.out.print("Enter an amount to be withdrawn: ");
        withdrawableAmount = scanner.nextDouble();
        if (withdrawableAmount > balance) {
            System.out.println("You don't have sufficient balance");
            return 0;
        } else if (withdrawableAmount < 1) {
            System.out.println("You can't withdraw less than 1$");
            return 0;
        } else {
            System.out.println("***************");
            System.out.printf("Your withdrawal of $%.2f was successfully\n", withdrawableAmount);
            return withdrawableAmount;
        }
    }
}
