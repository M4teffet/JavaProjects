package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        System.out.println("What a great name you have, " + yourName() + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        System.out.println("Your age is " + yourAge() + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        countTo();

        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        checkAnswer();

        System.out.println("Congratulations, have a nice day!");
    }

    private static void checkAnswer() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        while (answer != 2) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
    }

    private static void countTo() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number + 1 ; i++) {
            System.out.println(i + "!");
        }
    }

    private static int yourAge() {
        Scanner scanner = new Scanner(System.in);
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        return (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    }

    private static String yourName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
