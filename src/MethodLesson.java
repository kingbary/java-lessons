public class MethodLesson {

    public static void main(String[] arg) {

        String name = "Kingsley";
        int age = 50;

        // happyBirthday(name, age);
        double result = square(25);
        // System.out.println(result);
        System.out.println(cube(3));
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you!!");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You're %d years old today!\n", age);
        System.out.println("Happy birthday to you!!");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
