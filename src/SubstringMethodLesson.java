import java.util.Scanner;

public class SubstringMethodLesson {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email address: ");
        email = scanner.nextLine();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        if (email.contains("@")) {
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Enter a valid email address");
        }

        scanner.close();
    }
}
