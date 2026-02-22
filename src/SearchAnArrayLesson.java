import java.util.Scanner;

public class SearchAnArrayLesson {
    static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = { 1, 4, 5, 7, 2 };

        // boolean isFound = false;

        // int target = 8;
        // for (int i = 0; i < numbers.length; i++) {
        // if (target == numbers[i]) {
        // System.out.println("Element found at index " + i);
        // isFound = true;
        // break;
        // }
        // }
        // if (!isFound) {
        // System.out.println("Element not found");
        // }

        String[] fruits = { "Apple", "Kiwi", "Quava", "Mango", "Orange", "Strawberry" };
        String searchTerm;
        boolean isFound = false;

        System.out.print("Search for your favorite fruits: ");
        searchTerm = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (searchTerm.toLowerCase().equals(fruits[i].toLowerCase())) {
                System.out.println(searchTerm + " is available in stock");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(searchTerm + " is not available at the moment");
        }

        scanner.close();
    }

}
