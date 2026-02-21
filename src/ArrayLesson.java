import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    static void main(String[] arg) {
        // String[] fruits = { "apple", "banana", "paw paw" };

        // int[] numbers = { 1, 6, 8, 4, 5 };

        // Arrays.sort(numbers);

        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // for (int number = 0; number < numbers.length; number++) {
        // System.out.println(numbers[number]);
        // }

        // System.out.println(fruits[1]);
        // System.out.println(numbers);

        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.print("What number of food do you want?: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            if (i < 1) {
                System.out.print("Enter a food: ");
            } else {
                System.out.print("Enter another food: ");
            }
            foods[i] = scanner.next();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
