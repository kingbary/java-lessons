import java.util.Random;
import java.util.Scanner;

public class RandomLesson {
    public static void main(String[] arg) {
        Random random = new Random();
        double number;

        number = random.nextInt(1, 5);

        System.out.print(number);

        double result;

        result = Math.sqrt(49);
        result = Math.round(3.26);
        result = Math.ceil(3.26);
        result = Math.floor(3.99);
        result = Math.max(12, 20);
        result = Math.min(12, 20);

        System.out.print(result);

        // Hypotenuse Lesson

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypothenus of the triangle is: " + c + "cm");

        scanner.close();
    }
}
