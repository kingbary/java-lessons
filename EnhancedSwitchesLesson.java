import java.util.Scanner;

public class EnhancedSwitchesLesson {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter the week of the week: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday 😩");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend 🕺");
            default -> System.out.println("It's not a week day");
        }

        scanner.close();
    }
}
