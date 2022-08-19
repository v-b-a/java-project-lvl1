package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final String name = "Greet";
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static String getName() {
        return name;
    }

    public static void greetingUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
