import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " of" + item + "/s");
        System.out.println("Your total is: " + currency + total);
        System.out.println("Do item contain a: " + item.contains("a"));

        scanner.close();

    }
}
