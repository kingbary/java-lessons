public class StringMethodLesson {
    public static void main(String[] arg) {
        String name = "password";
        // int length = name.length();
        // char characterAt = name.charAt(5);
        // int indexOf = name.indexOf("w");
        // // System.out.println(length);
        // name = name.replace("a", "e");
        // name = name.trim();
        // System.out.println(name);

        // if (name.isEmpty()) {
        // System.out.println("Your name is empty!");
        // } else {
        // System.out.println("Hello" + name);
        // }

        // if (name.contains("a")) {
        //     System.out.println("Your name contain a!");
        // } else {
        //     System.out.println("Your name doesn't contain a space");
        // }

        if (name.equalsIgnoreCase("Password") || name.contains("a")) {
            System.out.println("Your name cannot be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
