public class PrintFLesson {
    public static void main(String[] arg) {
        // String name = "Adam";
        // char firstLetter = 'A';
        // int age = 50;
        // double height = 5.4;
        // boolean isEmployed = true;

        // double price = -23099000.0;

        // System.out.printf("Hello %s\n", name);
        // System.out.printf("Your name starts with a %c\n", firstLetter);
        // System.out.printf("You are %d years old\n", age);
        // System.out.printf("You are %.2f tall\n", height);
        // System.out.printf("Employment: %b\n", isEmployed);

        // System.out.printf("%s is %d years old and he is %.2f tall\n", name, age,
        // height);

        // System.out.printf("Price: %,.2f \n", price);

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if (isSenior) {
            if (isStudent) {
                System.out.println("You will get a student discount of 10%");
                System.out.println("You will get a senior discount of 20%");
                price *= 0.7;
            } else {
                System.out.println("You will get a senior discount of 20%");
                price *= 0.8;
            }
        } else {
            if (isStudent) {
                System.out.println("You will get a student discount of 10%");
                price *= 0.9;
            } else {
                price *= 1;
            }
        }

        System.out.printf("The price of the ticket is %.2f\n ", price);
    }
}
